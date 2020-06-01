package unibe.edu.ec.examen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumbersTest {

	private Numbers number;
	@Before
	public void before() {
		number=new Numbers(5, 2);
	}
	@Test
	public void testMultiplication() {
		assertEquals(10, number.multiplication());
	}
	@Test
	public void testDivision() {
		assertEquals(2.5, number.division(),1);
	}

}
