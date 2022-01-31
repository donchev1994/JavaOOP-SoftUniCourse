package Polymorphism.wildFarm.animals;

import Polymorphism.wildFarm.foods.Food;
import Polymorphism.wildFarm.foods.Meet;

public class Zebra extends Mammal{


    public Zebra(String name, String type, double weigth, String livingRegion) {
        super(name, type, weigth, livingRegion);
    }

    @Override
    public void eat(Food food) {
            if (food instanceof Meet){
                throw new IllegalArgumentException(getType() + " are not eating that type of food!");
            }

            super.eat(food);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }
}
