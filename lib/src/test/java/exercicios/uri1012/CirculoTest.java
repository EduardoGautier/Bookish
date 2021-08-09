
package Uri;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CirculoTest {
	@Test
	public void testOne() {
		Circulo c1 = new Circulo(5.2);
		double expected = 84.949;
		double actual = c1.getArea();
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testTwo() {
		Circulo c2 = new Circulo(15.2);
		double expected = 725.833;
		double actual = c2.getArea();
		assertEquals(expected, actual, 0.001);
	}
}
