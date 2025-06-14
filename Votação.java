package exercicios;

import java.util.Scanner;

public class Votação {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe sua idade: ");
		int idade = teclado.nextInt();
		int x = 2025 - idade;
		if (idade <= 15) {
			System.out.println("Você ainda é menor de idade e não pode votar.");
		} else if (idade >= 16 && idade <= 17) {
			System.out.println("Seu voto é opcional.");
		} else {
			System.out.println("O voto é obrigatório para você.");		
		}

	}

}