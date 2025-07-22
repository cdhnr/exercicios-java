package exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		a = 3.0;
		b = 4.0;
		c = 5.2;
			
		double trianguloRet = (a * c) / 2;
		
		double circulo = Math.pow(c, 2);
		double area = circulo * 3.14159;

		double trapezio = (a + b) / 2 * 5.2;

		double quadrado = b * b;
		Locale.setDefault(Locale.US);
		
		double triangulo = a * b;
		
		System.out.printf("TRIÂNGULO: %.3f%n", trianguloRet);
		System.out.printf("CÍRCULO: %.3f%n", area);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", triangulo);	
		
		sc.close();
	}

}
