package exercicios.uri1012;

public class Circulo extends Figura{
	
	private double raio;

	private static final double PI = 3.14159;


	public Circulo(double raio) {
		super();
		if (raio <= 0.0) {
			throw new IllegalArgumentException();
		}
		this.raio = raio;
	}

	@Override
	public double getArea() {
		return raio * raio * PI;
	}

}
