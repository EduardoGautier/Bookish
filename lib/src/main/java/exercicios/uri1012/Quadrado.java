package exercicios.uri1012;

/**
 * 
 * @author Eduardo Jose Gautier
 * 
 */

public class Quadrado extends Figura {

	private double lado;

	public Quadrado(double lado) {
		super();
		if (lado <= 0.0) {
			throw new IllegalArgumentException();
		}
		this.lado = lado;
	}

	@Override
	public double getArea() {
		return lado * lado;
	}
}
