package problemas;

import java.util.Scanner;

public class Problema4 {
	private boolean esPrimo(int numero) {
		int cont=2;
		boolean primo;
		primo=true;
		while (primo && cont<numero) {
			primo=numero % cont++ !=0;
		}
		return primo;
	}
	
	private String listaPrimos (int numero) {
		int cont;
		String cadena="2, ";
		boolean primo;
		primo = true;
		for (cont=3; cont<=numero; cont++) {
			Problema4 p = new Problema4();
			primo = p.esPrimo(cont);
			
			if ( primo == true) {
				cadena += cont + ", ";
			}
		}//cierre bucle principal
		cadena += numero;
		return cadena;
	}
		
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		String cadena;
		System.out.print("Introduce un numero: ");
		numero = teclado.nextInt();
		while ( numero < 0 ) {
			System.out.println("Debe ser un numero positivo. Introduce otro numero: ");
			numero = teclado.nextInt();
		}
		Problema4 x = new Problema4();
		cadena = x.listaPrimos(numero);
		System.out.println(cadena);
	}
}
