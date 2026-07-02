package valeriafarinosi.U5_W1_D4.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import valeriafarinosi.U5_W1_D4.entities.Beverage;
import valeriafarinosi.U5_W1_D4.entities.Pizza;
import valeriafarinosi.U5_W1_D4.entities.Topping;
import valeriafarinosi.U5_W1_D4.services.ItemService;

@Component
public class MyRunner implements CommandLineRunner {

    //    DI del service
    private final ItemService itemService;
    //    DI del context
    private final ApplicationContext ctx;

    public MyRunner(ItemService itemService, ApplicationContext ctx) {
        this.itemService = itemService;
        this.ctx = ctx;
    }


    @Override
    public void run(String... args) throws Exception {

        Pizza margherita = ctx.getBean("pizzaMargherita", Pizza.class);
        Topping cheese = ctx.getBean("cheese", Topping.class);
        Beverage water = ctx.getBean("water", Beverage.class);

//        itemService.saveNewItem(margherita);
        itemService.saveNewItem(cheese);
        itemService.saveNewItem(water);

    }
}
