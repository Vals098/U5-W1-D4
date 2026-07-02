package valeriafarinosi.U5_W1_D4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pizze")
@NoArgsConstructor
@Getter
@ToString(callSuper = true)
public class Pizza extends Item {

    private List<Topping> toppingList;

    public Pizza(String name, double price, int calories) {
        super(name, price, calories);
        this.toppingList = new ArrayList<>();
    }

    public void addTopping(Topping topping) {
        toppingList.add(topping);
    }

    @Override
    public int getCalories() {
        int totale = super.getCalories();

        for (Topping topping : toppingList) {
            totale += topping.getCalories();
        }

        return totale;
    }

    @Override
    public double getPrice() {
        double totale = super.getPrice();

        for (Topping topping : toppingList) {
            totale += topping.getPrice();
        }

        return totale;
    }


}
