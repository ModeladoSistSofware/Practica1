package series;
/**
 * Clase en java que genera una serie de número Primo.
 * 
 * @author Jairo González Lemus. Email : alu0100813272@ull.edu.es Universidad:
 *         Universidad de La Laguna. Práctica Asignatura: Modelado Sistemas
 *         Sofware.
 * @version 1.0
 * @since 2018-03-14
 */
public class Primo extends Serie {

	public Primo(int limiteSuper) {
		super(limiteSuper);
	}

	public static boolean isPrimo(int numero) {
		boolean result = true;
		int limeSup = (int) Math.sqrt((double) numero);// numeor hata proba
		int cont = 0;
		for (int i = 2; i <= limeSup; i++) {
			if ((numero % i) == 0) {
				cont++;
			}
		}
		if (cont >= 1) {
			result = false;
		}
		return result;
	}

	@Override
	public int next() {
		int aux = 0;
		if (this.datos.size() != 0) {
			aux = this.datos.get(this.datos.size() - 1);
		}

		aux++;
		boolean encontrado = false;
		while (!encontrado) {

			if (isPrimo(aux)) {
				encontrado = true;
			} else {
				aux++;
			}
		}

		return aux;
	}
}
