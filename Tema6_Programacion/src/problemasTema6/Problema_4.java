package problemasTema6;

import java.util.Scanner;
import java.util.Arrays;

public class Problema_4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] vector1 = new int[10];
		int[] vector2 = new int[10];
		int[] resultado = new int[10];
		int num=0,cont2=0;
		
		System.out.println("Introduce el primer vector");
		for(int i = 0; i < vector1.length; i++) {
			vector1[i] = teclado.nextInt();
		}
		System.out.println("Introduce el segundo vector");
		for(int i = 0; i < vector2.length; i++) {
			vector2[i] = teclado.nextInt();
		}
		
		for( int cont=0; cont < vector1.length; cont++) {
			num=vector1[cont];
			
			for(int i=0; i < vector2.length; i++) {
				if(num==vector2[i]) {
					cont2++;	
				}
			}
			resultado[cont]+=cont2;
			cont2=0;
		}
		for(int e=0;e<resultado.length;e++) {
			
			System.out.println("Elemento ("+vector1[e]+"):"+resultado[e]+"veces");
			}
	}
}
