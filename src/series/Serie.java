package series;

import java.util.ArrayList;
/**
 * Clase en java que representa una un serie de números.
 * @author Jairo González Lemus. Email : alu0100813272@ull.edu.es Universidad:
 *         Universidad de La Laguna. Práctica Asignatura: Modelado Sistemas Sofware.
 * @version 1.0
 * @since 2018-03-14
 */
public abstract class Serie {
	ArrayList<Integer> datos ;
    int limiteSuper;

	   /**
  * Método que tenar que imprementar todo las 
  * clases series para gnerar la serie
  * según que serie sea la autogenerara.
  */
	protected void generarSerie() {
		while(this.datos.size() < this.limiteSuper) {
			this.datos.add(next());
		}
	}
    /**
     * Método que que cogera el siguitne.
     */
    public abstract int next();
    
    /**
     * Contructor qeu se le pasa el limite superior
     * de nuestra serie.
     * @param El limite superior de la serie.
     */
    Serie(int limiteSuper){
    	datos = new ArrayList<Integer>();
    	this.limiteSuper = limiteSuper;
    	this.generarSerie();
    }
    /**
     * Método que determina si el numoe que se le pasa por parmatro 
     * pertenece a la serie.
     * @param dato
     * @return
     */
    public boolean pertenece(int dato) {
    	boolean result = false;
    	for(Integer aux : this.datos) {
	    	if(aux == dato) {
	    		result = true;
	    		return result;
	    	}
	    }
		return result;
    }

    
	/**
	 * Método que devuleve el conjunto de datos.
	 * @return el datos
	 */
	public ArrayList<Integer> getDatos() {
		return datos;
	}
	/**
	 * Método que devuleve el elemento de la posición n.
	 * @return el elemento
	 */
	public int getElemento(int n) {
		return this.datos.get(n);
	}
	/**
	 * Método que devuleve el limite superior.
	 * @return el limiteSuper
	 */
	public int getLimiteSuper() {
		return limiteSuper;
	}
	/**
	 * Método que suma todos los elemento de la lista.
	 * @return
	 */
	public int suma(){
		int result = 0;
		for(Integer aux : this.datos) {
	    	result = result + aux ;
	    }
		return result;
    }	
	/**
	 * Método que muestra los n primero elemento
	 * @param n
	 */
	public void muestraSubIntervalor(int n) {
		this.muestraSubIntervalor(0,n);
	}	
	/**
	 * Método que muestra los elementos del intrevalo n1 y n2.
	 * @param n1
	 * @param n2
	 */
	public void muestraSubIntervalor(int n1,int n2 ) {
		System.out.print( this.getElemento(n1) + "," );
		for(int i = n1 + 1 ; i < n2; i++) {
	    	System.out.print(  "," + this.getElemento(i) );
	    } 
		
	}
	/**
    * Método que introduce un dato en la serie. se verifica
    * si el dato que introducimos esta o no es nuestra serie.
    * @param El dato nuevo a introduci en la serie.
    */
    public void intorduce(int dato){
    	if(!pertenece(dato)) {
    		this.datos.add(dato);
    	}
    }
	/**
	 * Saca todo los dato sde la serie
	 * @return el estrin con todo los datos de la serie.
	 */
	@Override
	public String toString() {
		String result =  "";
		boolean bandera= true;
		for(Integer aux : this.datos) {
			if(bandera) {
				result = result +  aux ;
				bandera = false;
			}else {
				result = result + "," + aux ;
			}
	    }
		return result;
	}
	public void print() {
		System.out.println(this.toString());
	}
	

}
