package OOP.application;

import java.util.Locale;
import java.util.Scanner;

import OOP.entities.Triangle;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();


        System.out.println("Enter the measures of triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        
        double areaX, areaY;
        areaX = calcularArea(x.a, x.b, x.c);
        areaY = calcularArea(y.a, y.b, y.c);
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Lerger area: Y");
        }

        sc.close();
    }

    public static double calcularArea(double l1, double l2, double l3) {
        double p, area, aux;
        p = (l1 + l2 + l3) / 2;
        aux = p * (p - l1) * (p - l2) * (p - l3);
        area = Math.sqrt(aux);
        return area;
    }
}
