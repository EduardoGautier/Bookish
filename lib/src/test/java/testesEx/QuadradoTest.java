package testesEx;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercicios.uri1012.Quadrado;

class QuadradoTest {

	@Test
	public void testOne() {
		Quadrado q1 = new Quadrado(5.2);
		double expected = 84.949;
		double actual = q1.getArea();
		assertEquals(expected, actual, 0.001);
	}

}
