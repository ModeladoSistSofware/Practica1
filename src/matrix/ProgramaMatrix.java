package matrix;

import java.util.Scanner;


/**
 * Añade un método que realice el producto de 2 matrices de dimensiones mxn y
 * nxl, respectivamente. El programa solicitará las dimensiones de las matrices
 * a multiplicar y los elementos de las mismas por teclado, mostrando el
 * resultado de la operación en pantalla.
 * 
 * @author jai
 *
 */
public class ProgramaMatrix {
	private static Scanner scanner;

	public void pruebasFuncionamiento() {
		double[][] coefA = { { 3, 2, 1 }, { 1, 1, 3 }, { 0, 2, 1 } };
		double[][] coefB = { { 2, 1 }, { 1, 0 }, { 3, 2 } };

		Matrix A = new Matrix(3, 3, coefA);
		Matrix B = new Matrix(3, 2, coefB);

		A.producto(B).print();
		Matrix C = new Matrix("read.txt");
		C.print();
		C.write("write.txt");

	}

	public static double[][] crearArray(int m, int n){
		double[][] mUnidad= new double[m][n];
		  
	    for (int i=0; i < mUnidad.length; i++) {
	        for (int j=0; j < mUnidad[i].length; j++) {
	    	      System.out.println("Inserte valor del indice:");
	    	      mUnidad[i][j] = Double.parseDouble(new Scanner(System.in).nextLine().trim());
		}}
		return  mUnidad;
    }

	public static Matrix creaMatrix() {
		scanner = new Scanner(System.in);
		System.out.println("Ingrese tamaño fila de la matriz ");
	    int tamFila = scanner.nextInt();
	    System.out.println("Ingrese tamaño columnas de la matriz ");
	    int tamColumna = scanner.nextInt();
	    double[][] aux = crearArray(tamFila, tamColumna);
	    return  new Matrix(tamFila,tamFila, aux); 
	}
	
	public static void main(String[] args) {
		    // pruebasFuncionamiento(); 
		    Matrix A = creaMatrix();
	    	Matrix B = creaMatrix();
	    	A.print();
	    	B.print();
	    	A.producto(B).print();	
	}

}
