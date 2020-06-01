package unibe.edu.ec.examen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSquare {
	public Square square;
	@Before
	public void before() {
		square= new Square();
		double side=4.5;
		square.setSide(side);
	}
	@Test
	public void testcalculateArea () {
		assertEquals(20.25, square.calculateArea(),0.10);
	}
	@Test
	public void test() {
		assertEquals(18, square.calculatePerimeter(),0.10);
	}
}
