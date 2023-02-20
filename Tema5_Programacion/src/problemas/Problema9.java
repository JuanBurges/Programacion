package problemas;

import java.util.Scanner;

public class Problema9 {
	private double primeraRaiz(int a, int b, int c) {
		double raiz1;
		raiz1 = ( -b +Math.sqrt(b*b-4*a*c))/(2*a);
		return raiz1;
	}
	private double segundaRaiz (int a, int b, int c) {
		double raiz2;
		raiz2 = ( -b -Math.sqrt(b*b-4*a*c))/(2*a);
		return raiz2;
	}
	
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int a,b,c;
		double raiz1,raiz2;
		
		System.out.print("Introduce el valor del numero a: ");
		a = key.nextInt();
		System.out.print("Introduce el valor del numero b: ");
		b = key.nextInt();
		System.out.print("Introduce el valor del numero c: ");
		c = key.nextInt();
		if ( b*b -4*a*c < 0 ) {
			System.out.println("La raiz no tendra soluciones reales.");
		}else{
			Problema9 p = new Problema9();
			raiz1 = p.primeraRaiz(a, b, c);
			Problema9 n = new Problema9();
			raiz2 = n.segundaRaiz(a, b, c);
			System.out.print("Las raices de la ecuacion de segundo grado son "+raiz1+" y "+raiz2+".");
		}
	}
}
