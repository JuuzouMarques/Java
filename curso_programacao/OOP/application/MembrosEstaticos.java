package OOP.application;

import java.util.Scanner;

import OOP.util.Calculator;

public class MembrosEstaticos {

    public static final double PI = 3.14159;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Version 01
        System.out.println("Enter radius:");
        double radius = sc.nextDouble();
        double c = circunference(radius);
        double v = volume(radius);

        System.out.printf("Circunference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", PI);

        // Version 02
        System.out.println("Enter radius:");
        double rad = sc.nextDouble();
        double circ = Calculator.circunference(radius);
        double vol = Calculator.volume(rad);

        System.out.printf("Circunference: %.2f%n", circ);
        System.out.printf("Volume: %.2f%n", vol);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        sc.close();
    }

    public static double circunference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
