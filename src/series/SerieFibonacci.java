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
	}

    public static boolean isFibonacci(int numero) {
    	int cont = 0;
    	int fibo1=1; 
    	int fibo2=1; 
    	
    	while(cont < numero) {
    		if(numero == fibo2) {
    			return true;
    		}
    		cont++;
    		fibo2 = fibo1 + fibo2;
    		fibo1 = fibo2 - fibo1;
    	}
    	return false;
    }
    
	@Override
	public int next() {
		int aux1 = 0;
		int aux2 = 0;
		if (this.datos.size() > 1 ) {
			aux1 = this.datos.get(this.datos.size() - 1);
			aux2 = this.datos.get(this.datos.size() - 2);
		}else if(this.datos.size() == 1) {
	    	aux1 = 0;
			aux2 = 1;
		}
	    return aux1+aux2;
	}
	

}
