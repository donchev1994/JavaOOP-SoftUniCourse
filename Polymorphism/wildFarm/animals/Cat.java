package Polymorphism.wildFarm.animals;

import Polymorphism.wildFarm.foods.Food;


public class Cat extends Felime {
    private String breed;


    public Cat(String name, String type, double weigth, String livingRegion, String breed) {
        super(name, type, weigth, livingRegion);
        this.breed = breed;
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public String toString() {
        StringBuilder baseToString = new StringBuilder(super.toString());

        baseToString.insert(baseToString.indexOf(", ") + 1, " " + this.breed + ",");

        return baseToString.toString();
    }
}
