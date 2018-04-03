package matrix;
/**
 * A�ade un m�todo que realice el producto de 2 matrices de dimensiones mxn y nxl,
respectivamente. El programa solicitar� las dimensiones de las matrices a multiplicar y
los elementos de las mismas por teclado, mostrando el resultado de la operaci�n en
pantalla.
 * @author jai
 *
 */
public class ProgramaMatrix {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		 double[][] coefA={  
				 {3,2,1},
                 {1,1,3},
                 {0,2,1}};
		 double[][] coefB={  
				 {2, 1},
                 {1, 0},
                 {3, 2}};
		 
			Matrix A = new Matrix(3,3, coefA); 
			Matrix B = new Matrix(3,2, coefB);
			
			A.producto(B).print();
	}

}
