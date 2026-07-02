package valeriafarinosi.U5_W1_D4.entities;

import jakarta.persistence.*;
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

    @ManyToMany
    @JoinTable(
            name = "pizza_toppings",
            joinColumns = @JoinColumn(name = "pizza_id"),
            inverseJoinColumns = @JoinColumn(name = "topping_id")
    )
    private List<Topping> toppingList = new ArrayList<>();


    public Pizza(String name, double price, int calories) {
        super(name, price, calories);
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
