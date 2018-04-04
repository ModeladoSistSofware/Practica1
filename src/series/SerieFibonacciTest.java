package series;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SerieFibonacciTest {

	@Test
	void test() {
		SerieFibonacci aux = new SerieFibonacci(10);
		assertEquals("0,1,1,2,3,5,8,13,21,34", aux.toString());
		assertTrue(aux.isFibonacci(21));
		assertFalse(aux.isFibonacci(22));
		aux.print();
	}

}
