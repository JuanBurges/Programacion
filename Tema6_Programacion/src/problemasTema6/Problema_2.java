package problemasTema6;

import java.util.Scanner;
import java.util.Arrays;

public class Problema_2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] vector1 = new int[10];
		int[] vector2 = new int[10];
		int[] vector3 = new int[10];
		System.out.println("Introduce los valores del primer vector: ");
		for( int i = 0; i < vector1.length; i++ ) {
			vector1[i] = teclado.nextInt();
		}
		System.out.println("Introduce los valores del segundo vector: ");
		for( int i = 0; i < vector1.length; i++ ) {
			vector2[i] = teclado.nextInt();
		}
		for ( int s = 0; s < vector3.length; s++ ) {
			vector3[s] = vector1[s] + vector2[s];
		}
		System.out.println(Arrays.toString(vector3));
		
	}
}
