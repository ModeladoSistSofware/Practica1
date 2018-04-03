package vector;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class VectorTest {

	@Test
	void iniciarObjetoTest() {
		Vector vectA = new Vector();
		assertNotNull(vectA);
		assertEquals(0,vectA.getnDimensiones());
	}
	
	@Test
	void constructorTamTest() {
		Vector vectA = new Vector(5);
		assertNotNull(vectA);
		assertEquals(5,vectA.getnDimensiones());
	}
	@Test
	void redimencionaTest() {
		Vector vectA = new Vector();
		vectA.redimensiona(5);
		assertEquals(5,vectA.getnDimensiones());
	}
	@Test
	void meterDadosTest() {
		Vector vectA = new Vector();
		vectA.add(12.0);
		assertEquals(1,vectA.getnDimensiones());
		vectA.add(512.0);
		vectA.add(2.0);
		vectA.add(1.0);
		assertEquals(4,vectA.getnDimensiones());
	}
	@Test
	void toStringTest() {
		Vector vectA = new Vector();
		vectA.add(2.0);
		vectA.add(1.0);
		assertEquals("2.0,1.0",vectA.toString());
	}



}
