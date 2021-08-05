package exercicios.uri1002;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CirculoTest {
	@Test
	public void test2() {
		Circulo c1 = new Circulo(2.00);
		double expected = 12.5664;
		double actual = c1.getArea();
		assertEquals(expected, actual, 0.0001);
	}
	
	@Test
	public void test100Dot64() {
		Circulo c1 = new Circulo(100.64);
		double expected = 31819.3103;
		double actual = c1.getArea();
		assertEquals(expected, actual, 0.0001);
	}
	@Test
	public void test150() {
		Circulo c1 = new Circulo(150.00);
		double expected = 70685.7750;
		double actual = c1.getArea();
		assertEquals(expected, actual, 0.0001);
	}
}
