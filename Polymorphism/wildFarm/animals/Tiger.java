package Polymorphism.wildFarm.animals;

import Polymorphism.wildFarm.foods.Vegetable;
import Polymorphism.wildFarm.foods.Food;

public class Tiger extends Felime {

    public Tiger(String name, String type, double weigth, String livingRegion) {
        super(name, type, weigth, livingRegion);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable){
            throw new IllegalArgumentException(getType() + " are not eating that type of food!");
        }

        super.eat(food);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }
}
