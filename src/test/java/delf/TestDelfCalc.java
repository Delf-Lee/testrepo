package delf;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDelfCalc {

	@Test
	public void testAdd() {
		DelfCalc c = new DelfCalc();
		c.add(1, 2);
		assertEquals(3, c.getResult());
	}
	
	@Test
	public void testSub() {
		DelfCalc c = new DelfCalc();
		c.sub(10, 5);
		assertEquals(5, c.getResult());
	}
//	
//	@Test
//	public void testMul() {
//		DelfCalc c = new DelfCalc();
//		c.mul(1, 2);
//		assertEquals(2, c.getResult());
//	}
}
