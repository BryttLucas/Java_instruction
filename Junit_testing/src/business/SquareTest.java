package business;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void JUnitSquareTest() {
	//	fail("Not yet implemented");
		
			JUnitTesting junit = new JUnitTesting();
			assertEquals (64, junit.square(8));
			assertEquals (49, junit.square(7));
		}
	}


