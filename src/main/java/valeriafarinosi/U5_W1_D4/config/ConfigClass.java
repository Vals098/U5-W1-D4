package valeriafarinosi.U5_W1_D4.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import valeriafarinosi.U5_W1_D4.entities.Beverage;
import valeriafarinosi.U5_W1_D4.entities.Pizza;
import valeriafarinosi.U5_W1_D4.entities.Topping;


@Configuration
public class ConfigClass {

    //    TOPPINGS
    @Bean
    public Topping tomato() {
        return new Topping("Tomato", 0.50, 20);
    }

    @Bean
    public Topping cheese() {
        return new Topping("Cheese", 0.69, 92);
    }

    @Bean
    public Topping ham() {
        return new Topping("Ham", 0.99, 35);
    }

    @Bean
    public Topping onions() {
        return new Topping("Onions", 0.69, 22);
    }

    @Bean
    public Topping pineapple() {
        return new Topping("Pineapple", 50.00, 24);
    }

    @Bean
    public Topping salame() {
        return new Topping("Salame", 0.99, 86);
    }

    //BEVERAGES
    @Bean
    public Beverage water() {
        return new Beverage("Water", 1.29, 0);
    }

    @Bean
    public Beverage lemonade() {
        return new Beverage("Lemonade", 1.29, 128);
    }

    @Bean
    public Beverage wine() {
        return new Beverage("Wine", 7.49, 607);
    }

    //    PIZZE
    @Bean
    public Pizza pizzaMargherita() {
        Pizza p = new Pizza("Pizza Margherita", 4.99, 1104);

        return p;
    }

    @Bean
    public Pizza nonPizzaHawaii() {
        Pizza p = new Pizza("Pizza Hawaii", 4.99, 1104);

        p.addTopping(ham());
        p.addTopping(pineapple());

        return p;
    }

    @Bean
    public Pizza pizzaSalame() {
        Pizza p = new Pizza("Pizza Salame", 4.99, 1104);

        p.addTopping(salame());

        return p;
    }

    //    MENU
//    @Bean
//    public Menu menu() {
//        return new Menu(
//                List.of(pizzaMargherita(), pizzaSalame(), nonPizzaHawaii()),
//                List.of(water(), lemonade(), wine()),
//                List.of(tomato(), cheese(), ham(), pineapple(), salame(), onions())
//        );
//    }


}
