package testesEx;

import org.junit.jupiter.api.Test;

import exercicios.uri1012.Triangulo;

import static org.junit.jupiter.api.Assertions.*;

public class TrianguloTest {
	@Test
	public void testOne() {
		Triangulo t1 = new Triangulo(3.0, 5.2);
		double expected = 7.800;
		double actual = t1.getArea();
		assertEquals(expected, actual, 0.001);
	}

	@Test
	public void testTwo() {
		Triangulo t2 = new Triangulo(12.7, 15.2);
		double expected = 96.520;
		double actual = t2.getArea();
		assertEquals(expected, actual, 0.001);
	}
}
