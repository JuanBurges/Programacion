package problemasTema6;

import java.util.Scanner;
import java.util.Arrays;

public class Problema_3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] vector = new int[10];
		int mayor=0,menor=0,posMayor=0,posmenor=0;
		System.out.println("Introduce los valores del vector: ");
		for( int i = 0; i < vector.length; i++ ) {
			vector[i] = teclado.nextInt();
			if( i == 0 ){
				mayor = vector[0];
				menor = vector[0];
			}
			if (vector[i] > mayor) {
				mayor = vector[i];
				posMayor = i;
			}
			if (vector[i] < menor) {
				menor = vector[i];
				posmenor = i;
			}
		}
		System.out.println("El valor mas pequeño es el "+menor+", y esta en la posicion "+posmenor);
		
		System.out.println("El valor mas grande es el "+mayor+", y esta en la posicion "+posMayor);
   }
	
}