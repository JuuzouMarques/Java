package exercicios;

import java.util.Scanner;

public class exercicios05 {
    // Exercícios com for
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Exercício 01
        int num = sc.nextInt();
        if (num >= 1 && num <= 1000) {
            for (int i = 1; i <= num; i += 2) {
                System.out.println(i);
            }
        }

        // Exercício 02
        int n = sc.nextInt();
        int in = 0, out = 0;
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            if (number >= 10 && number <= 20) {
                in++;
            } else {
                out++;
            }
        }
        System.out.printf("%d in %n%d out", in, out);

        sc.close();
    }
}
