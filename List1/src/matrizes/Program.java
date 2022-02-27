package matrizes;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Integer teste[][] = new Integer[n][n];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				int aux = sc.nextInt();
				teste[i][j] = aux;
			}
		}
		
		int qtdNegativos = 0;
		System.out.println("Main diagonal:");
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (i == j) {
					System.out.print(teste[i][j] + " ");
				}
				if (teste[i][j] < 0) {
					qtdNegativos++;
				}
			}
		}
		System.out.println("");
		System.out.println("Negative numbers: " + qtdNegativos);
		
		sc.close();
	}

}
