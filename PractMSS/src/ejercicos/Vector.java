package ejercicos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.security.spec.ECField;

/**
 * Clase en java que representa una un vector de numero double.
 * @author Jairo Gonz�lez Lemus. Email : alu0100813272@ull.edu.es Universidad:
 *         Universidad de La Laguna. Pr�ctica Asignatura: Modelado Sistemas Sofware.
 *         Notas : Si hay una función que lo hace utilizarla no volver a copiar codigo.
 * @version 1.0
 * @since 2018-03-14
 */
public class Vector {
	private double[] datos;
	private int nDimensiones;// esto y ase puede coge de length.
    
	/**
	 * Constructore por defecto.
	 * @param nDimensiones
	 */
	Vector(){	
		this.nDimensiones = 0;
		datos = new double[this.nDimensiones];
    }
	
	/**
	 * Borramos el array y lo creamo con un tama�o nuevo.
	 * @param nuevaNDim
	 */
	public void redimensiona(int nuevaNDim) {
		this.nDimensiones = nuevaNDim;  
		datos = new double[this.nDimensiones];
	}
	/**
	 * Constructore que le pasamos al dimensiones de nuestro vector.
	 * @param nDimensiones
	 */
	Vector(int nDimensiones){	
		this.nDimensiones = nDimensiones;
		datos = new double[this.nDimensiones];
    }
	/**
	 * Método Muestre en pantalla los coeficientes del vector
	 */
    public void print(){
    	System.out.println(this.toString());
    }
    
	 /** (sin Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String result = "";
		for(double aux: this.datos) {
			result = result + aux + ",";
		}
		return result;
	}
	
	/**
	 * Método que permita realizar el producto escalar entre dos
	 * vecotre n-dimensionales.
	 * @param aux
	 * @return
	 */
	public double  productoEscalar(Vector aux) {
		double suma = 0;
		for(int i = 0; i< this.getnDimensiones() ; i++) {
			suma = suma + this.getDatos(i) * aux.getDatos(i); 
		}
		return suma;
	}  
	    
	/**
	* M�todo accesor al array de datos.
	* @return el datos
	*/
	public double[] getDatos() {
		return datos;
	}
	
	/**
	* M�todo accesor a un datos de la variable datos. Se le pasa el indice para saber
	* cual dato es el que nos retorna.
	* @return el datos
	*/
	public double getDatos(int indice) {
		return datos[indice];
	}

	/**
	 * Método que retorna el tamaño de mi vector.
	 * @return el nDimensiones
	 */
	public int getnDimensiones() {
		return nDimensiones;
	}

	/**
	 * @param nDimensiones el nDimensiones a establecer
	 */
	public void setnDimensiones(int nDimensiones) {
		this.nDimensiones = nDimensiones;
	}
	   
	/**
	 * Método que lee los datos del vector de un archivo que se le pasa
	 * El primer entero que se lee es el tamaño del vector.
	 * @param namFile
	 */
	public void read(String namFile) {
		String cadena;
		FileReader file = null;
	    BufferedReader buffer = null;
		
	    try{
	        file = new FileReader(namFile);
	        buffer = new BufferedReader(file);
	        int indice = 0;
	        cadena = buffer.readLine();      
	        this.redimensiona(Integer.parseInt(cadena.trim()));
	        
	        while((cadena = buffer.readLine())!=null) {
	            
	        	this.datos[indice++] = Integer.parseInt(cadena.trim());
	        	System.out.println(cadena);
	            
	            
	        }
	        buffer.close();
	    }catch(Exception e){
	    	System.out.println( e.getMessage() );	
	    }
	}
	
	  public static void main(String args[])
      {
		  Vector nuevo = new Vector();
		  nuevo.read("vector.txt");
		  System.out.println(nuevo);
      
      }
	
		
}