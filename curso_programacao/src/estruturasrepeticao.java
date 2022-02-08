package src;

import java.util.Scanner;

public class estruturasrepeticao {
    // Estruturas de repetição
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int soma = 0;
        while (x != 0) {
            x = sc.nextInt();
            soma += x;
        }
        System.out.println(soma);
        
        sc.close();
    }
}
