package problemas;

import java.util.Scanner;

public class Problema5 {
	private String esFactor ( int p, int q ) {
		int cont=1,numero=0;
		String cadena="";
		while ( cont < p && cont < q) {
			if( p % cont == 0 && q % cont ==0 && cont>numero) {
				cadena="";
				cadena+=cont;
			}
			cont++;
		}
		return cadena;
	}
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int p,q;
		String cadena;
		
		System.out.print("Introduce el primer numero: ");
		p = teclado.nextInt();
		while ( p < 0 ) {
			System.out.print("Deben ser numeros positivos. Introduce otra vez el primer numero: ");
			p = teclado.nextInt();
		}
		System.out.print("Introduce el segundo numero: ");
		q = teclado.nextInt();
		while ( q < 0 ) {
			System.out.print("Deben ser numeros positivos. Introduce otra vez el segundo numero: ");
			q = teclado.nextInt();
		}
		Problema5 z = new Problema5();
		cadena = z.esFactor(p,q);
		System.out.println("El M.C.D. de "+p+" y "+q+" es "+cadena+".");
		
	}
}