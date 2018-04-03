package series;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;




class testSerie {
    Primo nueva ;
	@Before
	public void before() {
		nueva = new  Primo(10);
	}

	@Test
	void iniciarObjetoTest() {
		assertNotNull(nueva);
		assertEquals(10, nueva.getLimiteSuper())
	}
	
	
	
	
}
