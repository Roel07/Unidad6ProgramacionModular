package src;
import java.util.*;

public class Arreglo1{

	public static void main(String[] args) {
		Arreglo1 a = new Arreglo1();

	}

	//Global a la clase Arreglo1
	int [] arreglo = new int[5];
	Scanner entrada = new Scanner(System.in);


	public Arreglo1(){

		for (int i=0; i<5; i++ ) {
			pedirValor(i); 
			
		}

			for (int i=0; i<5; i++ ) {
			mostrarDato(i); 
		}
		double promedio = getPromedio();
		System.out.println("El promedio es " + promedio);


}


	public double getPromedio(){
		int total =0;
		for (int i=0; i<5 ; i++ ) {
			total +=arreglo[i];
			
		}
		double promedio = (double) total/5;
		return promedio;
	}

	public void mostrarDato(int numero){
		System.out.println("El indice es "+numero+ " el valor es "+ arreglo[numero]);
	}

	public void pedirValor(int numero){
		System.out.println("Ingrese el valor No.  " +numero + ":  ");
		arreglo[numero] = entrada.nextInt();

	}


}