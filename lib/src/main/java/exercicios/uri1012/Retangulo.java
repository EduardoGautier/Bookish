package exercicios.uri1012;

/**
 * 
 * @author  Eduardo Jose Gautier
 * 
 */

public class Retangulo extends Figura {
	private double base;
	private double altura;

	public Retangulo(double base, double altura) {
		super();
		if (base <= 0.0) {
			throw new IllegalArgumentException();
		}
		if (altura <= 0.0) {
			throw new IllegalArgumentException();
		}
		this.base = base;
		this.altura = altura;
	};

	@Override
	public double getArea() {
		return base * altura;
	}

}
