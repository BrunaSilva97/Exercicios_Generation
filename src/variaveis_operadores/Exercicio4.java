package variaveis_operadores;

import java.util.Scanner;

public class Exercicio4 {

public static void main(String[] args) {
		
		float n1, n2, n3, n4;
		Scanner diferença = new Scanner(System.in);

		System.out.println("Número 1:");
		n1 = diferença.nextFloat();
		System.out.println("Número 2:");
		n2 = diferença.nextFloat();
		System.out.println("Número 3:");
		n3 = diferença.nextFloat();
		System.out.println("Número 4:");
		n4 = diferença.nextFloat();
		
		System.out.println("Diferença: " + ((n1 * n2) - (n3 * n4)));
	}
}
