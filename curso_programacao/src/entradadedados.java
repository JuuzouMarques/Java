package src;

import java.util.Scanner;

public class entradadedados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Palavra
        String s;
        s = sc.next();
        System.out.println("Você digitou: " + s);

        // Número inteiro
        int n;
        n = sc.nextInt();
        System.out.println("Você digitou:  " + n);

        // Ponto flutuante; Para considerar o separador como ponto, usar 'Locale.setDefault(Locale.US)'
        double d;
        d = sc.nextDouble();
        System.out.println("Você digitou: " + d);

        // Caractere; Recebe somente a primeira letra digitada.
        char c;
        c = sc.next().charAt(0);
        System.out.println("Você digitou: " + c);

        // Vários dados na mesma linha
        String g;
        int h;
        double i;
        g = sc.next();
        h = sc.nextInt();
        i = sc.nextDouble();
        System.out.println("Dados digitados:");
        System.out.printf("%s %n%d %n%f", g, h ,i);

        sc.close();
    }
}
