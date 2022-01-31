package Inheritance.Restaurant;

import java.math.BigDecimal;

public class Beverages extends Product{

    private double milliliters;

    public Beverages(String name, BigDecimal price,double ml){
        super(name,price);
        this.milliliters = ml;
    }

    public double getMilliliters() {
        return milliliters;
    }
}
