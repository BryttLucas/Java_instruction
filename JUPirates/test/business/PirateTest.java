package business;

import static org.junit.Assert.*;

import org.junit.Test;

public class PirateTest {

	@Test
	public void pirateConstructorTest() {
	//	fail("Not yet implemented");
		Pirate p = new Pirate ("Sam");
		// assert that the name
		assertEquals("Sam", p.getName());
		assertEquals(4, p.getLimbsRemaining());
	}
	@Test
	public void octoPirateTest() {
	//	fail("Not yet implemented");
		Pirate p = new Pirate ("Sam");
		// assert that the name field
		assertEquals("Sam", p.getName());
		assertEquals(4, p.getLimbsRemaining());
}
}