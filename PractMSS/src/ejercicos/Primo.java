package ejercicos;

import java.util.stream.IntStream;

/**
 * Clase en java que genera una serie de n�mero Primo.
 * @author Jairo Gonz�lez Lemus. Email : alu0100813272@ull.edu.es Universidad:
 *         Universidad de La Laguna. Pr�ctica Asignatura: Modelado Sistemas Sofware.
 * @version 1.0
 * @since 2018-03-14
 */
public class Primo extends Serie {

	Primo(int limiteSuper) {
		super(limiteSuper);
		generarSerie();
	}
	
	@Override
	protected void generarSerie() {
	   int n = this.getLimiteSuper();
	   for(int i = 0; i < n; i++){
		   if(isPrimo(i)){
		      this.introduce(i);
		   }
		}
	}
	
	//Test de primalidad de Lehman y Peralta: 
	public static boolean isPrimo(int num) {
		int raiz = (int)Math.sqrt(num);
		for(int cont = 2; cont <=raiz;cont++){
		   	if(num % cont ==0){
		   		return false;
		   	}
		}
		return true;
	}

	public static void main(String args[])
    {
		  System.out.print(Primo.isPrimo(500));
    }
	
}
