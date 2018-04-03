package matrix;
/**
 * Añade un método que realice el producto de 2 matrices de dimensiones mxn y nxl,
respectivamente. El programa solicitará las dimensiones de las matrices a multiplicar y
los elementos de las mismas por teclado, mostrando el resultado de la operación en
pantalla.
 * @author jai
 *
 */
public class ProgramaMatrix {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
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
