package Inheritance.Animals;

public class Cat extends Animal{

    public Cat(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    protected String produceSound(){
        return "Meow meow";
    }

}
