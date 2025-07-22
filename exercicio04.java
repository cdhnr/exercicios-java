package exercicios1;

import java.util.Scanner;
import java.util.Locale;

public class exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Número do funcionário: ");
		int func = teclado.nextInt();
		System.out.println("Horas trabalhadas: ");
		int hora = teclado.nextInt();
		System.out.println("Valor que recebe por hora: ");
		double valorHora = teclado.nextDouble();
		
		double salario = (double) hora * valorHora;
		
		System.out.println("NUMBER = " + func);
		System.out.printf("SALARY = U$%.2f%n", salario);
		Locale.setDefault(Locale.US);
	}

}
