package src;

import java.util.Scanner;

import OOP.entities.Product;

public class ArrayAndLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de pessoas: ");
        int n = sc.nextInt();
        double sum = 0.0;
        double heigth[] = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
            heigth[i] = sc.nextDouble();
            sum += heigth[i];
        }
        System.out.printf("A altura média foi de %.2f%n", (sum/n));

        System.out.print("Número de produtos: ");
        int num = sc.nextInt();
        double soma = 0.0;
        Product prod[] = new Product[num];
        for (int i = 0; i < prod.length; i++) {
            sc.nextLine();
            System.out.print("Digite o nome do Produto " + (i + 1) + ": ");
            String name = sc.nextLine();
            System.out.print("Digite o preço do Produto " + (i + 1) + ": $ ");
            double price = sc.nextDouble();
            prod[i] = new Product(name, price);
            soma += prod[i].getPrice();
        }
        System.out.printf("Preço médio: %.2f%n", (soma / prod.length));

        String nomes[] = new String[] {"Maria", "Bob", "Alex"};
        for (int i=0; i<nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        System.out.println("--------------------");
        for (String nome : nomes) {
            System.out.println(nome);
        }        

        sc.close();
    }
}
