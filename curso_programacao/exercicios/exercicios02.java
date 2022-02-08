package exercicios;
import java.util.Scanner;

public class exercicios02 {
    // Execícios estruturas sequenciais
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Exercício 01
        int a, b;
        System.out.print("DIGITE DOIS NÚMEROS: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("SOMA = " + (a + b));
        
        // Exercício 02
        double p = 3.14159;
        double r, A;
        System.out.print("DIGITE O VALOR DO RAIO: ");
        r = sc.nextDouble();
        A = p * r * r;
        System.out.printf("A ÁREA DO CÍRCULO VALE: %.4f%n", A);
        
        // Exercício 03
        int c, d, e, f, dif;
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();
        dif = (c*d - e*f);
        System.out.println("DIFERENÇA: " + dif);
        
        // Exercício 04
        int num, hr;
        double porHora, salario;
        num = sc.nextInt();
        hr = sc.nextInt();
        porHora = sc.nextDouble();
        salario = hr * porHora;
        System.out.printf("FUNCIONÁRIO Nº %d %nSALÁRIO: R$ %.2f%n", num, salario);

        sc.close();
    }
}
