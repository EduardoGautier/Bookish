package Uri;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrapezioTest {

	@Test
	public void testGetArea() {
		Trapezio t1 = new Trapezio(3.0,4.0,5.2);
		double expected = 18.2;
		double actual = t1.getArea();
		assertEquals(expected, actual, 0.001);
	}

	
	
}
