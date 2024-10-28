package variaveis_operadores;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		float salario, abono;
		Scanner novo = new Scanner(System.in);
		
		System.out.println("Digite o salário:"); //10000,00
		salario = novo.nextFloat();
		
		System.out.println("Digite o abono:"); //1000,00
		abono = novo.nextFloat();
		
		System.out.println("Novo salario: " + (salario + abono));
		
	}
}
