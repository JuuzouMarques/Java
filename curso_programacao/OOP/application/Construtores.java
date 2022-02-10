package OOP.application;

import java.util.Locale;
import java.util.Scanner;

import OOP.entities.Product;

public class Construtores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantitiy in stock: ");
        int quantity = sc.nextInt();
        System.out.println();
        Product prod = new Product(name, price, quantity);

        System.out.println("Product data: " + prod.toString());


        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        prod.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + prod.toString());

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        prod.removeProducts(quantity);

        System.out.println();
        System.out.print("Updated data: " + prod.toString());

        sc.close();
    }
}
