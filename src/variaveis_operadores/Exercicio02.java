package variaveis_operadores;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, nota4;
		Scanner media = new Scanner(System.in);

		System.out.println("Nota 1:"); //10
		nota1 = media.nextFloat();
		System.out.println("Nota 2:"); //8
		nota2 = media.nextFloat();
		System.out.println("Nota 3:"); //7
		nota3 = media.nextFloat();
		System.out.println("Nota 4:"); //7,5
		nota4 = media.nextFloat();
		
		System.out.println("Média: " + (nota1 + nota2 + nota3 + nota4)/4);
		
	}

}
