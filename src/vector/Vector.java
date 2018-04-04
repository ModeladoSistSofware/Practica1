package vector;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * Clase en java que representa una un vector de numero double.
 * 
 * @author Jairo González Lemus. Email : alu0100813272@ull.edu.es Universidad:
 *         Universidad de La Laguna. Práctica Asignatura: Modelado Sistemas
 *         Sofware.
 * @version 1.0
 * @since 2018-03-14
 */
public class Vector implements Cloneable {
	private double[] datos;

	/**
	 * Constructor por defecto.
	 * @param nDimensiones
	 */
	public Vector() {
		datos = new double[0];
	}
	/**
	 * Constructore que le pasamos al dimensiones de nuestro vector.
	 * @param nDimensiones
	 */
	public Vector(int nDimensiones) {
		datos = new double[nDimensiones];
	}

	/**
	 * Borramos el array y lo creamos con un tamaño nuevo.
	 * @param nuevaNDim
	 */
	public void redimensiona(int nuevaNDim) {
		datos = new double[nuevaNDim];
	}

	/**
	 * Método Muestra en pantalla los coeficientes del vector
	 */
	public void print() {
		System.out.println(this.toString());
	}

	/**
	 * (sin Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String result = "";

		for (int i = 0; i < this.getnDimensiones(); i++) {
			if (i < this.getnDimensiones() - 1) {
				result = result + datos[i] + ",";
			} else {
				result = result + datos[i];
			}
		}
		return result;
	}
	/**
	 * Método analogo a tu strig pero el separador
	 */
	public String toStringSpacio() {
		String result = "";

		for (int i = 0; i < this.getnDimensiones(); i++) {
			if (i < this.getnDimensiones() - 1) {
				result = result + datos[i] + " ";
			} else {
				result = result + datos[i];
			}
		}
		return result;
	}
	/**
	 * Método que permita realizar el producto escalar entre dos vecotre
	 * n-dimensionales.
	 * 
	 * @param aux
	 * @return
	 */
	public double productoEscalar(Vector aux) {
		double suma = 0;
		if (aux.getnDimensiones() == this.getnDimensiones()) {
			for (int i = 0; i < this.getnDimensiones(); i++) {
				suma = suma + this.getDatos(i) * aux.getDatos(i);
			}
		} else {
			System.err.println("Vectores de distinto tamaño");
		}
		return suma;
	}

	/**
	 * Método accesor al array de datos.
	 * @return el datos
	 */
	public double[] getDatos() {
		return datos;
	}

	/**
	 * Método accesor a un datos de la variable datos. Se le pasa el indice para
	 * saber cual dato es el que nos retorna.
	 * 
	 * @return el datos
	 */
	public double getDatos(int indice) {
		return datos[indice];
	}

	/**
	 * Método que retorna el tamaño de mi vector.
	 * 
	 * @return el nDimensiones
	 */
	public int getnDimensiones() {
		return this.datos.length;
	}

	/**
	 * Método que permite duplicar este objeto.
	 */
	public Vector clone() throws CloneNotSupportedException {
		Vector clon = (Vector) super.clone();
		return clon;
	}

	/**
	 * Se añade un dato a continuación del último elemnto del vector.
	 * 
	 * @param dato
	 */
	public void add(double datos) {
		double[] aux = null;
		if (this.getnDimensiones() == 0) {
			this.redimensiona(1);
			this.datos[0] = datos;
		} else {

			aux = this.datos.clone();
			this.redimensiona(getnDimensiones() + 1);
			for (int i = 0; i < aux.length; i++) {
				this.datos[i] = aux[i];
			}
			this.datos[getnDimensiones() - 1] = datos;
		}
	}
	/**
	 * Método que cambia el elemnto que esta en la posicion n
	 * por el que se le pasa como parametor.
	 * @param n
	 * @param datos
	 */
     public void setElemento(int n, double datos) {
    	 this.datos[n] = datos ;
     }
	/**
	 * Método que los datos del vector desde el archivo que se le pasa.
	 * @param namFile
	 */
	public void write(String nameFile) {
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter(nameFile);
			pw = new PrintWriter(fichero);
			pw.println(toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Nuevamente aprovechamos el finally para
				// asegurarnos que se cierra el fichero.
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	/**
	 * Método que coge los datos de un archivo y lo mete en vector.
	 * @param namFile
	 */
	public void read(String nameFile) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File(nameFile);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			// Lectura del fichero
			String linea;
			while ((linea = br.readLine()) != null) {
				add(linea);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void add(String linea) {
		String aux[] = linea.split("[ ,]");
		for (String val : aux) {
			add(Double.parseDouble(val));
		}
	}

}