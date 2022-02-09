package OOP;

import java.util.Scanner;

public class ProblemNoOOP {
    // Problema sem OOP
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a1, a2, b1, b2, c1, c2, x, y;

        System.out.println("Enter the measures of triangle X:");
        a1 = sc.nextDouble();
        sc.nextLine();
        b1 = sc.nextDouble();
        sc.nextLine();
        c1 = sc.nextDouble();
        x = calcularArea(a1, b1, c1);
        System.out.println("Enter the measures of triangle Y:");
        a2 = sc.nextDouble();
        sc.nextLine();
        b2 = sc.nextDouble();
        sc.nextLine();
        c2 = sc.nextDouble();
        y = calcularArea(a2, b2, c2);
        System.out.printf("Triangle X area: %.4f%n", x);
        System.out.printf("Triangle Y area: %.4f%n", y);
        if (x >y) {
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
