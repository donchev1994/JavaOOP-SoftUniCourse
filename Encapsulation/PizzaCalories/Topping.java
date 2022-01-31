package Encapsulation.PizzaCalories;

import java.util.Map;
import java.util.Set;

public class Topping {

    private static final Map<String, Double> TOPPING_TYPES_WITH_MODIFIERS =
            Map.of("Meet", 1.2,
                    "Veggies", 0.8,
                    "Cheese", 1.1,
                    "Souce", 0.9);

    private String toppingtype;
    private double weight;


    public Topping(String toppingtype, double weight) {
        this.setToppingtype(toppingtype);
        this.setWeight(weight);
    }

    public void setToppingtype(String setToppingtype) {
        if (!TOPPING_TYPES_WITH_MODIFIERS.containsKey(toppingtype)) {
            throw new IllegalArgumentException("Cannot place "
                    + toppingtype + " on top of your pizza.");
        }
        this.toppingtype = setToppingtype;
    }

    public void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(
                    toppingtype + " weight should be in range [1...50]."
            );
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        return this.weight * 2 * TOPPING_TYPES_WITH_MODIFIERS.get(this.toppingtype);
    }

}
