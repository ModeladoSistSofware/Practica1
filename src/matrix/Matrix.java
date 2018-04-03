package matrix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

import vector.Vector;

/**
 * Clase en java que representa una matriz de mXn.
 * @author Jairo González Lemus. Email : alu0100813272@ull.edu.es Universidad:
 *         Universidad de La Laguna. Práctica Asignatura: Modelado Sistemas Sofware.
 * @version 1.0
 * @since 2018-03-14
 */
public class Matrix{
	
	Vector[] matrix;
	/**
	 * Constructor pro defecto tamaño 1 y 1
	 */
	public Matrix(){
		super();
		matrix = new Vector[1];
		matrix[0]= new Vector(1);	
	}
	/**
	 * Constructor que se le pasan las dimenciones para poderlo inicializar.
	 * @param nDimensiones
	 * @param mDimensiones
	 */
	Matrix(int mDimensiones, int nDimensiones) {
		matrix = new Vector[mDimensiones];
		for(int i = 0 ; i < mDimensiones; i++) {
			matrix[i] = new Vector(nDimensiones);
		}
	}
	/**
	 * Constructor que crea una matriz de dimensión mxn
	 * con todo los elemnto del array coef.
	 * @param m
	 * @param n
	 * @param coef
	 */
	Matrix(int m, int n, double[][] coef) {
		this(m,n);
		for(int i = 0 ; i < getNumRow() ; i++) {
			for(int j = 0 ; j < getNumCol(); j++) {
				 setElemento(i, j, coef[i][j]);
			}
		}
	}
	/**
	 * Método que cambia el dato en la posicon mxn pro 
	 * el que se le pasa como parametro.
	 * @param m
	 * @param n
	 * @param dato
	 */
	public void setElemento(int m, int n, double dato) {
		matrix[m].setElemento(n,dato);
	}
	/**
	 * Método que da el número de filas.
	 * @return
	 */
	public int getNumRow() {
		return matrix.length;
	}
	/**
	 * Método que extrae el elemento en la posicion mxn
	 * los elemnto son de 1 en adelante.
	 * @param m
	 * @param n
	 * @return retorna el valor del elemento.
	 */
	public double getElemento(int m, int n) {
		return matrix[m].getDatos(n);
	}
	/**
	 * Método que da el número de columnas.
	 * @return
	 */
	public int getNumCol(){
		return matrix[0].getnDimensiones();
	}
	/**
	 * Dara como resultado el producto de las dos matrix
	 * @param nueva
	 * @return
	 */
	public Matrix producto( Matrix nueva) {
		Matrix aux = new Matrix(this.getNumRow(),nueva.getNumCol());
		
		if(this.getNumCol() == nueva.getNumRow()) {
			for(int i = 0; i < this.getNumRow(); i++){
		         for(int j = 0; j < nueva.getNumCol(); j++){
		           aux.setElemento(i, j, this.getFila(i).productoEscalar(nueva.getColumna(j))); 
		         }
		     }
		}
		return aux;
	}
	/**
	 * Métod para coger una fila y tranformala el vector
	 * @param n
	 * @return
	 */
	public Vector getFila(int m) {
		return matrix[m];
	}
	/**
	 * Métod para coger la columna y tranformala el vector
	 * @param n
	 * @return
	 */
	public Vector getColumna(int n) {
		Vector aux = new Vector();
		 for(int i = 0; i < this.getNumRow(); i++){
	         for(int j = 0; j < this.getNumCol(); j++){
	             if(j == n) {
	            	 aux.add(this.getElemento(i, j));
	             }    
	         }			
		}
		return aux;
	}
	
	
	/**
	 * Metodo que dara como resultado Matriz traspuesta.
	 * @param nueva
	 * @return
	 */
	public Matrix traspuesta() {
		 int fila = this.getNumRow();
		 
		 int col = this.getNumCol();
		 
	     double[][] aux = new double[col][fila];
		 for(int j = 0; j < col; j++){
	            for(int i = 0; i < fila; i++){
	                   aux[i][j] = matrix[i].getDatos(j);
	            }
		 }
	    return new Matrix(col,fila,aux);
	 }
	/**
	 * Método que coge los datos de un archivo y lo mete en matrix.
	 * @param namFile
	 */
	public void read(String nameFile) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File(nameFile);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			// Lectura del fichero
			String linea;
			int cont = 0;
			! y segunda lines es tal
			while ((linea = br.readLine()) != null) {
				  matrix[cont++].add(linea);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
	/**
	 * Método que muestar por pantalla la matriz.
	 */
	public void print() {
		System.out.println(this.toString());
	}	
	/* (sin Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String result = "";
		for(int i = 0 ; i < this.getNumRow(); i++) {
			result = result + matrix[i].toString() + "\n";
		}
		return result;
	}
	
	
}
