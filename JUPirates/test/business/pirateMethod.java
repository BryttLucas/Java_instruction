package business;

import static org.junit.Assert.*;

import org.junit.Test;

public class pirateMethod {

	@Test
	public void deadTest() {
	//	fail("Not yet implemented");
		Pirate p = new Pirate ("Pete");
		assertFalse(p.isDead());
	}

}
