package exercicios1;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		double x = Math.pow(a, 2);
		double y = 3.14159;
		
		double resultado = x * y;
		System.out.println(resultado);
		System.out.printf("%.4f%n", resultado);
	}

}
