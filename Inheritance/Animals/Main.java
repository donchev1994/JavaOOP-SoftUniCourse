package Inheritance.Animals;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("Beast!")){
            String[] animalData = scanner.nextLine().split("\\s+");
            //Frog,Dog,Cat,Kitten,Tomcat
            String name = animalData[0];
            int age = Integer.parseInt(animalData[1]);
            try {
                if(age < 0) {
                    throw new IllegalAccessException("Invalid input!");
                }
                if(!animalData[2].equals("Male") && !animalData[2].equals("Female")){
                    throw new IllegalAccessException("Invalid input!");
                }
            } catch (IllegalAccessException e){
                System.out.println("Invalid input!");
                command = scanner.nextLine();
                continue;
            }

            Gender gender = Gender.valueOf(animalData[2].toUpperCase());


            switch (name){
                case "Frog":
                    Frog frog = new Frog(name,age,gender);
                    frog.toString();
                    break;
                case "Dog":
                    Dog dog = new Dog(name,age,gender);
                    dog.toString();
                    break;
                case "Cat":
                    Cat cat = new Cat(name,age,gender);
                    cat.toString();
                    break;
                case "Kitten":
                    Kitten kitten = new Kitten(name,age);
                    kitten.toString();
                    break;
                case "Tomcat":
                    Tomcat tomcat = new Tomcat(name,age);
                    tomcat.toString();
                    break;
            }




            command = scanner.nextLine();
        }


    }
}
