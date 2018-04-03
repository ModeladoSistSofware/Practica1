package series;

/**
 * Clase en java que genera una serie de número fibonacci.
 * @author Jairo González Lemus. Email : alu0100813272@ull.edu.es Universidad:
 *         Universidad de La Laguna. Práctica Asignatura: Modelado Sistemas Sofware.
 * @version 1.0
 * @since 2018-03-14
 */
public class SerieFibonacci extends Serie {

	SerieFibonacci(int limiteSuper) {
		super(limiteSuper);
		generarSerie();
		
	}
	
	/**
	 * Se reescribe el método siguente para gener la serie.
	 * La version iterativa de fibonacci.
	 */
	@Override
	protected void generarSerie() {  	    
	    
		int n1=0,n2=1,n3;  
		this.intorduce(n1);
		this.intorduce(n2);
		for(int i=2;i <  this.getLimiteSuper();++i)
		{  
		      n3 = n1 + n2;    
			  this.intorduce(n3);
			  n1 = n2;    
			  n2 = n3;    
		} 
	 }

}
