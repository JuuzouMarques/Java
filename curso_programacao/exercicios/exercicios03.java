package exercicios;

import java.util.Scanner;

public class exercicios03 {
    // Exercícios Estruturas condicionais
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Exercício 01
        int numero = sc.nextInt();
        if (numero >= 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }

        // Exercício 02
        numero = sc.nextInt();
        if (numero%2 == 0) {
            System.out.println(numero + " é PAR");
        } else {
            System.out.println(numero + " é IMPAR");
        }

        // Exercício 03
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        if (a%b == 0 || b%a ==0) {
            System.out.println(a + " e " + b + " são múltiplos");
        } else {
            System.out.println(a + " e " + b + " não são múltiplos");
        }

        // Exercício 04
        int horaIni, horaFim;
        horaIni = sc.nextInt();
        horaFim = sc.nextInt();
        if (horaFim <= horaIni) {
            horaFim += 24; 
        }
        System.out.println("A duração do jogo foi de " + (horaFim-horaIni) + " horas");

        // Exercício 05
        double[] precos = {0.00, 4.00, 4.50, 5.00, 2.00, 1.50}; 
        int codLanche, Quantidade;
        codLanche = sc.nextInt();
        Quantidade = sc.nextInt();
        System.out.println("Total: R$ " + (precos[codLanche] * Quantidade));

        // Exercício 06
        String intervalo[] = {"[0,25]", "(25,50]", "(50, 75]", "(75,100]"};
        double num = sc.nextDouble();
        if (num >= 0 && num <= 25) {
            System.out.println("Intervalo " + intervalo[0]);
        } else {
            if (num > 25 && num <= 50) {
                System.out.println("Intervalo " + intervalo[1]);
            } else {
                if (num > 50 && num <= 75) {
                    System.out.println("Intervalo " + intervalo[2]);
                } else {
                    if (num > 75 && num <= 100) {
                        System.out.println("Intervalo " + intervalo[3]);
                    } else {
                        System.out.println("Fora do Intervalo");
                    }
                }
            }
        }

        // Exercício 07
        double coor1, coor2;
        coor1 = sc.nextDouble();
        coor2 = sc.nextDouble();
        if (coor1 == 0.0 && coor2 == 0.0) {
            System.out.println("ORIGEM");
        } else {
            if (coor1 == 0.0) {
                System.out.println("EIXO Y");
            } else {
                if (coor2 == 0.0) {
                    System.out.println("EIXO X");
                } else {
                    if (coor1 > 0 && coor2 > 0) {
                        System.out.println("Q1");
                    } else {
                        if (coor1 < 0 && coor2 > 0) {
                            System.out.println("Q2");
                        } else {
                            if (coor1 < 0 && coor2 < 0) {
                                System.out.println("Q3");
                            } else {
                                System.out.println("Q4");
                            }
                        }
                    }
                }
            }
        }
        
        sc.close();
    }
}