package exercicios.uri1012;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado;
		double a;
		double b;
		double c;
		Figura[] fs;

		teclado = new Scanner(System.in);
		a = teclado.nextDouble();
		b = teclado.nextDouble();
		c = teclado.nextDouble();
		teclado.close();

		fs = new Figura[] { new Triangulo(a, c), new Circulo(c), new Trapezio(a, b, c), new Quadrado(b),
				new Retangulo(a, b) };

		for (Figura f : fs) {
			System.out.printf("%s: %.3f\n", f.getClass().getSimpleName().toUpperCase(), f.getArea());
		}
	}

}