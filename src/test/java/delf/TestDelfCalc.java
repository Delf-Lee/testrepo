package delf;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDelfCalc {

	@Test
	void testAdd() {
		DelfCalc c = new DelfCalc();
		c.add(1, 2);
		assertEquals(3, c.getResult());
	}

}
