package exercicios1;

import java.util.Scanner;
import java.util.Locale;

public class exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Locale.setDefault(Locale.US);
			Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o código da peça A: ");
		int codA = teclado.nextInt();
		System.out.print("Digite a quantidade de peças A: ");
		int pecasA = teclado.nextInt();
		System.out.print("Digite o valor unitário A: ");
		double valorUnitarioA = teclado.nextDouble();		
		
		double valorA = (double) pecasA * valorUnitarioA;
		
		System.out.print("Digite o código da peça B: ");
		int codB = teclado.nextInt();
		System.out.print("Digite a quantidade de peças B: ");
		int pecasB = teclado.nextInt();
		System.out.print("Digite o valor unitário B: ");
		double valorUnitarioB = teclado.nextDouble();
		
		double valorB = (double) pecasB * valorUnitarioB;
		
		double valorFinal = (double) valorA + valorB;		
		System.out.printf("Valor a pagar: R$%.2f%n", valorFinal);
		
		teclado.close();
	}

}
