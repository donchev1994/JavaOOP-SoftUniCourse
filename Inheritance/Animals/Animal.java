package Inheritance.Animals;

public class Animal {

    private String name;
    private int age;
    private Gender gender;


    public Animal(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    protected String produceSound() {
        return "";
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(System.lineSeparator());
        sb.append(getName() + " " + getAge() + " " + this.gender.getAsString());
        sb.append(System.lineSeparator());
        sb.append(this.produceSound());

        return sb.toString();
    }
}
