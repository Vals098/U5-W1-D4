package valeriafarinosi.U5_W1_D4.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "beverages")
@NoArgsConstructor
@Getter
@ToString(callSuper = true)
public class Beverage extends Item {
    public Beverage(String name, double price, int calories) {
        super(name, price, calories);
    }
}
