package vector;

import java.util.Scanner;

/**
 * El programa solicitará la dimensión de los
 * vectores a multiplicar y las componentes de ambos vectores, mostrando los vectores y
 * el resultado en pantalla.
 * @author Jairo González Lemus. Email : alu0100813272@ull.edu.es Universidad:
 *         Universidad de La Laguna. Práctica Asignatura: Modelado Sistemas Sofware.
 * @version 1.0
 * @since 2018-03-14
 */

public class ProgramaVector {
    public static void escribirFichero() {
    	Vector vectA = new Vector();
		vectA.add(5);
		vectA.add(6);
		vectA.add(8);
		vectA.add(9);
		vectA.add(3);
		vectA.add(4);
		vectA.write("write.txt");
    }
    public static void leerFichero() {
		Vector vectA = new Vector();
		vectA.read("read.txt");
		vectA.print();
    }
     

	public static void main(String[] args) {
		//escribirFichero();
		//leerFichero();
		Vector vectA = new Vector();
		Vector vectB = new Vector();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresee los tamaño vectores ");
	    int tam = scanner.nextInt();
	    
		for(int i = 1; i <= 2; i++) {
		    for(int j=0 ; j < tam ; j++) {
		    	System.out.println("Vector " + i + " inserte valor del indice " + j);
		    	double datos = scanner.nextDouble();
		    	if(i==1) {
		    	      vectA.add(datos);
		    	}else {
		    		vectB.add(datos);
		    	}
		    }
		}
		
		double aux = vectA.productoEscalar(vectB);
		System.out.println("El resultador es: " + aux);	
		System.out.println("Los Datos de los vecotres son:  " );
		vectA.print();
		vectB.print();
		
	}

}
