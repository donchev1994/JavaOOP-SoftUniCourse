package Inheritance.Animals;

public class Tomcat extends Cat{

    public Tomcat(String name, int age) {
        super(name, age, Gender.MALE);
    }

    @Override
    protected String produceSound(){
        return "MEOW";
    }

}
