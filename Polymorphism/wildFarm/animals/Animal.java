package Polymorphism.wildFarm.animals;

import Polymorphism.wildFarm.foods.Food;

import java.text.DecimalFormat;

public abstract class Animal {
    private String livingRegion;
    private String name;
    private String type;
    private double weigth;
    private int foodEaten;

    protected Animal(String name, String type, double weigth,String livingRegion) {
        this.name = name;
        this.type = type;
        this.weigth = weigth;
        this.livingRegion = livingRegion;
    }



    public abstract void makeSound();

    protected String getType() {
        return this.type;
    }

    public void eat(Food food) {
        this.foodEaten += food.getQuantity();
    }

    @Override
    public String toString() {
        DecimalFormat formatter = new DecimalFormat("##.##");
        return String.format("%s[%s, %s, %s, %d]",
                this.type,
                this.name,
                formatter.format(this.weigth),
                this.livingRegion,
                this.foodEaten
        );
    }
}
