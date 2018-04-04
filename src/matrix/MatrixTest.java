package matrix;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 * Clase del metodo test para el funcionamiento correcto
* @author Jairo González Lemus. Email : alu0100813272@ull.edu.es Universidad:
*         Universidad de La Laguna. Práctica Asignatura: Modelado Sistemas Sofware.
* @version 1.0
* @since 2018-03-14
*/
class MatrixTest {
 
	@Test
	public void consturcorDefTest() {
		Matrix datos = new Matrix();
		assertEquals(1,datos.getNumRow());
		assertEquals(1,datos.getNumCol());
		assertEquals(0.0,datos.getElemento(0,0));
	}
	@Test
	public void constMxNTest() {
		Matrix datos = new Matrix(2,2);
		assertEquals(2,datos.getNumRow());
		assertEquals(2,datos.getNumCol());
		assertEquals(0.0,datos.getElemento(0,0));
		assertEquals(0.0,datos.getElemento(0,1));
		assertEquals(0.0,datos.getElemento(1,0));
		assertEquals(0.0,datos.getElemento(1,1));
	}
	@Test
	public void constCoefTest() {
		 double[][] coef={  
				 {32, 87, 3, 589},
                 {12, -30, 190, 0},
                 {622, 127, 981,-5}};
		Matrix datos = new Matrix(3,4, coef);
		assertEquals(3,datos.getNumRow());
		assertEquals(4,datos.getNumCol());
		datos.print();
	}
}
