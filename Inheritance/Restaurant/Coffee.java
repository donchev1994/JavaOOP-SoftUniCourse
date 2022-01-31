package Inheritance.Restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage {

    protected static final double COFFE_MILLILITERS = 50;
    protected static final BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.50);
    private double caffeine;

    public Coffee(String name, double caffeine){
        super(name, COFFEE_PRICE, COFFE_MILLILITERS);
        this.caffeine = caffeine;
    }

    public double getCaffeine() {
        return caffeine;
    }
}
