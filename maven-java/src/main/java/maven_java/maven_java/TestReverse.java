package maven_java.maven_java;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestReverse {

	@Test
	public void test() {
		String result = Application.reverseString("abc");
		assertEquals("cba", result);
	}
	
	@Test
	public void testPositiveSum() {
		int result = Application.getSum(2,2);
		assertEquals(4, result);
	}
	@Test
	public void testNegativeSum() {
		int result = Application.getSum(2,-2);
		assertEquals(0, result);
	}
	@Test
	public void testBothNegativeSum() {
		int result = Application.getSum(-2,-2);
		assertEquals(-4, result);
	}

}
