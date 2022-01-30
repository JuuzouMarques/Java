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

        // Ler até a quebra de linha
        String s1, s2, s3;

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("Dados digitados:");
        System.out.printf("%s %n%s %n%s", s1, s2, s3);
        
        sc.close();

        // Funções Matemáticas

        double x, y, z;
        x = 3.0;
        y = 4.0;
        z = -5.0;

        System.out.println("Raiz quadrada de " + y + " vale: " + (int) Math.sqrt(y));
        System.out.println(x + " elevado a " + y + " é igual a: " + Math.pow(x, y));
        System.out.println("O valor absoluto de " + z + " é " + Math.abs(z));
    }
}
