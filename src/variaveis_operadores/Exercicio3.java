package variaveis_operadores;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		float bruto, noturno, horasExtras, descontos;
		Scanner liquido = new Scanner(System.in);

		System.out.println("Salario Bruto:"); //2000
		bruto = liquido.nextFloat();
		System.out.println("Adicional Noturno:"); //500
		noturno = liquido.nextFloat();
		System.out.println("Horas Extras:"); //100
		horasExtras = liquido.nextFloat();
		System.out.println("Descontos:"); //200
		descontos = liquido.nextFloat();
		
		System.out.println("Salaário Líquido: " + (bruto + noturno + (horasExtras*5) - descontos));
		

	}

}
