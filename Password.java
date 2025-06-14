package exercicios;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe sua senha de acesso:");
		int senha = teclado.nextInt();
		int x = 1234;
		if (senha == x) {
			System.out.println("Acesso liberado.");
		} else {
			System.out.println("Senha incorreta.");
		}			
	}

}
