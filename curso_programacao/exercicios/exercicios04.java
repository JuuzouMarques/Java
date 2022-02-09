package exercicios;

import java.util.Scanner;

public class exercicios04 {
    // Exercícios estrutura While
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Exercício 01
        System.out.print("Digite sua senha: ");
        int senha = sc.nextInt();
        while (senha != 2002) {
            System.out.println("Senha Inválida");
            senha = sc.nextInt();
        }
        System.out.println("Acesso liberado!");

        // Exercício 02
        System.out.println("Digite as coordenadas:");
        int coor1, coor2;
        coor1 = sc.nextInt();
        coor2 = sc.nextInt();
        while (coor1 != 0 && coor2 != 0) {
            if (coor1 > 0 && coor2 > 0) {
                System.out.println("Primeiro Quadrante");
            } else {
                if (coor1 < 0 && coor2 > 0) {
                    System.out.println("Segundo Quadrante");
                } else {
                    if (coor1 < 0 && coor2 < 0) {
                        System.out.println("Terceiro Quadrante");
                    } else {
                        System.out.println("Quarto Quadrante");
                    }
                }
            }

            System.out.println("Digite as coordenadas:");
            coor1 = sc.nextInt();
            coor2 = sc.nextInt();
        }
        
        // Exercicio 03
        int alcool = 0, gasolina = 0, diesel = 0, voto = 0;
        voto = sc.nextInt();
        sc.nextLine();
        while (voto != 4) {
            switch (voto){
                case 1:
                    alcool ++;
                    break;
                case 2:
                    gasolina ++;
                    break;
                case 3:
                    diesel ++;
                    break;
                default:
                    break;
            }
            voto = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Muito Obrigado!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
