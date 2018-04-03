package ejercicos;
/**
 * Clase en java que genera una serie de n�mero fibonacci.
 * @author Jairo Gonz�lez Lemus. Email : alu0100813272@ull.edu.es Universidad:
 *         Universidad de La Laguna. Pr�ctica Asignatura: Modelado Sistemas Sofware.
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
	 * Nota : Los métodos iterativos mas eficiente pero se reliza con mas código.
	 */
	@Override
	protected void generarSerie() {  	    
	    
		
		/*
		 * for(i tam){
		 *   next nest;
		 * }
		 * */
		int n1=0,n2=1,n3;  
		this.introduce(n1);
		this.introduce(n2);
		for(int i=2;i <  this.getLimiteSuper();++i)
		{  
		      n3 = n1 + n2;    
			  this.introduce(n3);
			  n1 = n2;    
			  n2 = n3;    
		} 
	 }
	/**
	 * Metodo que retorna el siguente elemnto de la lista.
	 */
	 public next(int ){
		 
	 }
	
	  public static void main(String args[])
      {
		  SerieFibonacci nuevo = new SerieFibonacci(500);
		  
		  System.out.print(nuevo);
      }
	

}
