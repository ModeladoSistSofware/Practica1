package series;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PrimoTest {
	@Test
	public void metodoSumaElementotest() {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(5);
		numeros.add(9);
		
		assertEquals(15,Primo.sumaElementos(numeros));
		
	}
}
