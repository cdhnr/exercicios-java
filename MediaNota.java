package exercicios;

import java.util.Scanner;

public class MediaNota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe sua primeira nota: ");
		float nota1 = teclado.nextFloat();
		if (nota1 < 0 || nota1 > 10) {
		 System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
		 return;
		}
		System.out.println("Informe sua segunda nota: ");
		float nota2 = teclado.nextFloat();
		if (nota2 < 0 || nota2 > 10) {
		 System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
		 return;
		}
		float resultado = (nota1 + nota2) / 2;
		System.out.println(resultado);
		
		
		if (resultado >= 7) {
			System.out.println("Você está aprovado!");
		} else if (resultado > 5 && resultado < 7) {
			System.out.println("Você está em recuperação.");
		} else {
			System.out.println("Você está reprovado.");
		}
	}
}
