package sample.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class Mytest1 {

	@Test
	public void test() {
		// fail("Not yet implemented");
		int i = 3;
		if (i != 3) {
			fail("1는 3이 아닙니다.");
		}
	}
	
	@Test
	public void equals() {
		int i = 3;
		boolean b = true;
		Object c = null;
		
		assertEquals(i, 3);
		assertEquals(b, true);
		assertTrue(b);
		assertNull(c);
		
	}
	
	@Test
	public void notEquals() {
		int i = 5;
		boolean b = false;
		Object c = new Object();
		
		assertNotEquals(i, 3);
		assertFalse(b);
		assertNotNull(c);
	}
}
