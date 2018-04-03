package series;

import java.util.stream.IntStream;

/**
 * Clase en java que genera una serie de número Primo.
 * @author Jairo González Lemus. Email : alu0100813272@ull.edu.es Universidad:
 *         Universidad de La Laguna. Práctica Asignatura: Modelado Sistemas Sofware.
 * @version 1.0
 * @since 2018-03-14
 */
public class Primo extends Serie {

	public Primo(int limiteSuper) {
		super(limiteSuper);
		generarSerie();
	}

	@Override
	protected void generarSerie() {
		
		int n = this.getLimiteSuper();
		int c = 1;
		int dato = 2;
		int d = 2;
		while (c <= n) {
		   if (dato % d == 0) {
		      if (dato == d) {
		    	  this.intorduce(dato);
		         // System.out.print(dato + ", ");
		         c++;
		      }
		      d = 2;
		      dato++;
		   }
		   else
		      d++;
		}
	}
	
	//Test de primalidad de Lehman y Peralta: 
	public static boolean isPrimo(int number) {
			    return number > 1 && 
		            IntStream.rangeClosed(2, (int) Math.sqrt(number))
		                .noneMatch(i -> number % i == 0);
	}
	  public static void main(String args[])
      {
		  System.out.print(Primo.isPrimo(500));
      }
	    /**
	     * Método que detecta si el número que se le pasa como parametro es primo.
	     * Metodo uclides.
	     * @param n
	     * @return
	     */
		static public boolean isPrimo(int n){
			int limeSup =(int) Math.sqrt((double)n);
			
			//return ==  ? false: true;
		}
		
		/**
		 * 
		 * @param desde
		 * @param hasta
		 */
		static public void print(int desde, int hasta){
			ArrayList<Integer> setPrimos = todoLosPrimos(desde,hasta);
			System.out.println("Primos de " + desde + " " + hasta );
			
			for(Integer num : setPrimos){	
				System.out.println( num + " ");
			}
			
		}
		
		/**
		 * Método que devuelve una lista de primos comprendido entre dos números.
		 * @param desde
		 * @param hasta
		 * @return
		 */
		static public ArrayList<Integer> todoLosPrimos(int desde, int hasta){
			
			ArrayList<Integer> listaPrimos = new ArrayList<Integer>();
			for(int n = desde ; n <= hasta ; n++ ){
				if(isPrimo(n)){
					listaPrimos.add(n);
				}
			}
			return listaPrimos;
		}
				
		/**
		 * Método que sumas todo los elementos de un array de enteros.
		 * @param numeros
		 * @return
		 */
		static public int sumaElementos(ArrayList<Integer> numeros){
			int sum = 0;	
			for(Integer num : numeros){	
				sum+=num;
			}
			return sum;
		}
}
