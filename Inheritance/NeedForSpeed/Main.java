package Inheritance.NeedForSpeed;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FamilyCar familyCar = new FamilyCar(23,105);

        familyCar.drive(100);
        System.out.println(familyCar.getFuel());
    }
}
