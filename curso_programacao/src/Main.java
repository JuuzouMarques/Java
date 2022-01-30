package src;

import java.util.Locale;

public class Main {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        System.out.println("Olá, mundo!");
        int y = 32;
        double x = 45.311646;
        double result = y + x;
        System.out.println(y);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        System.out.printf("A soma de " + y + " com %.2f resulta em: %.2f%n", x, result);

        String nome = "Maria";
        int idade = 25;
        double salario = 2500.00;
        System.out.printf("%s tem %d anos, e salário de %.2f reais %n", nome, idade, salario);

        // Casting
        double a = 2.9;
        int b = (int) a;
        System.out.println(b);

    }
}
