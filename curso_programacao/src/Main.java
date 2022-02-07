package src;

import java.util.Locale;
import java.util.Scanner;

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

        Scanner sc = new Scanner(System.in);
        System.out.println("Que horas são?");
        int hora = sc.nextInt();
        if (hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }

        System.out.print("Qual o dia da semana? ");
        int nDia = sc.nextInt();
        String sDia;
        switch (nDia) {
            case 1:
                sDia = "Domingo";
                break;
            case 2:
                sDia = "Segunda-Feira";
                break;
            case 3:
                sDia = "Terça-Feira";
                break;
            case 4:
                sDia = "Quarta-Feira";
                break;
            case 5:
                sDia = "Quinta-Feira";
                break;
            case 6:
                sDia = "Sexta-Feira";
                break;
            case 7:
                sDia = "Sábado";
                break;
            default:
                sDia = "Dia inválido";
                break;
        }
        System.out.println("Hoje é " + sDia);
        sc.close();

        // Expressão Condicional Ternária; (condição) ? valor_se_true : valor_se_false
    }
}
