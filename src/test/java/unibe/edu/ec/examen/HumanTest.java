package unibe.edu.ec.examen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HumanTest {
	private Human human;

	@Before
	public void before() {
		human = new Human();
		String name = "Rafael";
		human.setName(name);
		human.setHigh(1.80);
	}

	@Test
	public void testGetNameLength() {
		assertEquals(6, human.getNameLength());
		;
	}
	@Test
	public void testDivideHigh() {
		assertEquals(0.80, human.divideHigh(2),0.1);
	}

}
