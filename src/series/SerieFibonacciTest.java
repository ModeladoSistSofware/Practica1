package series;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SerieFibonacciTest {

	@Test
	void test() {
		SerieFibonacci aux = new SerieFibonacci(10);
		assertEquals("0,1,2,3,5,8,13,21,34,55", aux.toString());
		aux.print();
	}

}
