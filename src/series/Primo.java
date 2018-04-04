package series;

import java.util.stream.IntStream;

/**
 * Clase en java que genera una serie de n�mero Primo.
 * @author Jairo Gonz�lez Lemus. Email : alu0100813272@ull.edu.es Universidad:
 *         Universidad de La Laguna. Pr�ctica Asignatura: Modelado Sistemas Sofware.
 * @version 1.0
 * @since 2018-03-14
 */
public class Primo extends Serie {

	public Primo(int limiteSuper) {
		super(limiteSuper);
		this.generarSerie();
	}
	   /**
     * M�todo que tenar que imprementar todo las 
     * clases series para gnerar la serie
     * seg�n que serie sea la autogenerara.
     */
	protected void generarSerie() {
		
		while(this.datos.size() < this.limiteSuper) {
			System.out.println(this.datos.size());
			this.datos.add(next());
		}
	}
	
	public static boolean isPrimo(int numero) {
	   /* boolean result = true;    
        int limeSup =(int) Math.sqrt((double)numero);// numeor hata proba
        for(int i = 1;  i<= limeSup ; i++) {
			if(( numero % i) == 0) {
				 result = false;
				 return result;
			}
		}
        return result;*/
		return true;
	}
	
		@Override
		public int next() {
			    int aux = 0;
			    if(this.datos.size() != 0) {
				     aux  = this.datos.get(this.datos.size());
			    }
			   
				aux++;
				boolean encontrado = false;
				while(!encontrado) {
					
					if(isPrimo(aux)) {
						encontrado = false;
					}else{
						aux++;
					}
				}
				
				return aux;
		}
}
