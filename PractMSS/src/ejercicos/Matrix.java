package ejercicos;
/**
 * Clase en java que representa una matriz de mXn.
 * @author Jairo Gonz�lez Lemus. Email : alu0100813272@ull.edu.es Universidad:
 *         Universidad de La Laguna. Pr�ctica Asignatura: Modelado Sistemas Sofware.
 *         Nota:  Este diseño es un diseño por composicion. El que trata el try cach es el que te
 *         llama lanzo la execpcion.
 * @version 1.0
 * @since 2018-03-14
 */
public class Matrix{
    
	Vector[] matrix;
	int mDimensiones; // Filas. //estos ya esta con lent
	int nDimensiones; // Columnas. // esto scocon getNDimeinones(), hacer traspuesta. coger a diagoa inverse de uan matriz.
	// Ponentia de una matir pow(argumaento)  soy yo mismo o 3 la matriz al cubo eella pro co de tos 
	// pow de ella menus. potencia n de una matriz.
	
	// clase faraccion implement un clase para las fracciones mista por noua expecializacion o por el otor ladoa
	// qñireo k las metir stien un dato mietro si es pro fila o  por comulm si es orientacion pro fila o por columan.
	// calcula la trapuesta. cambia la fila x la columan.
	// Calcula la potendcia de la matrix ba
	
	/**
	 * Constructor que se le pasan las dimenciones para poderlo inicializar.
	 * @param nDimensiones
	 * @param mDimensiones
	 */
	Matrix(int mDimensiones, int nDimensiones) {
		matrix = new Vector[mDimensiones];
		for(Vector aux : this.matrix) {
			aux.redimensiona(nDimensiones);
		}
		this.nDimensiones = nDimensiones;
		this.mDimensiones = mDimensiones;
	}
	/**
	 * M�todo que da el n�mero de filas.
	 * @return
	 */
	public int getNumRow() {
		return this.mDimensiones;
	}
	/**
	 * M�todo que da el n�mero de columnas.
	 * @return
	 */
	public int getNumCol() {
		return this.nDimensiones;
	}
	/**
	 * Método que devuelve el valor que esta
	 * en la posición mxn.
	 * @param m la fila localizada.
	 * @param n columna localizada.
	 */
	public double getDato(int m,int n){
		return this.matrix[m].getDatos(n);
	}
}
