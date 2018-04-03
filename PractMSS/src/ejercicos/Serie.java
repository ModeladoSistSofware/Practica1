package ejercicos;

import java.util.ArrayList;
/**
 * Clase en java que representa una un serie de n�meros.
 * @author Jairo Gonz�lez Lemus. Email : alu0100813272@ull.edu.es Universidad:
 *         Universidad de La Laguna. Pr�ctica Asignatura: Modelado Sistemas Sofware.
 * @version 1.0
 * @since 2018-03-14
 */
public abstract class Serie {
	private ArrayList<Integer> datos ;
    int limiteSuper;

    /**
     * M�todo que tenar que imprementar todo las 
     * clases series para gnerar la serie
     * seg�n que serie sea la autogenerara.
     */
    protected abstract void generarSerie();
    
    /**
     * Contructor qeu se le pasa el limite superior
     * de nuestra serie.
     * @param El limite superior de la serie.
     */
    Serie(int limiteSuper){
    	datos = new ArrayList<Integer>();
    	this.limiteSuper = limiteSuper;
    }
    /**
     * M�todo que determina si el numoe que se le pasa por parmatro 
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
	 * M�todo que devuleve el conjunto de datos.
	 * @return el datos
	 */
	public ArrayList<Integer> getDatos() {
		return datos;
	}
	/**
	 * M�todo que devuleve el elemento de la posici�n n.
	 * @return el elemento
	 */
	public int getElemento(int n) {
		return this.datos.get(n);
	}
	/**
	 * M�todo que devuleve el limite superior.
	 * @return el limiteSuper
	 */
	public int getLimiteSuper() {
		return limiteSuper;
	}
	/**
	 * M�todo que suma todos los elemento de la lista.
	 * @return
	 */
	public int suma(){
		int result = 0;
		for(Integer aux : this.datos) {
	    	result += aux ;
	    }
		return result;
    }	
	/**
	 * M�todo que muestra los n primero elemento
	 * @param n
	 */
	public void muestraSubIntervalor(int n) {
		this.muestraSubIntervalor(0,n);
	}	
	/**
	 * M�todo que muestra los elementos del intrevalo n1 y n2.
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
    * M�todo que introduce un dato en la serie. se verifica
    * si el dato que introducimos esta o no es nuestra serie.
    * @param El dato nuevo a introduci en la serie.
    */
    public void introduce(int dato){
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
		for(Integer aux : this.datos) {
	    	result = result + "," + aux ;
	    }
		return result;
	}
	
	
	

}
