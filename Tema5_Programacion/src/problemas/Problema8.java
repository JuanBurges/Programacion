package problemas;

import java.util.Scanner;

public class Problema8 {
	private int factorialM (int m){
		int cont=m,factM=1;
		while (cont > 1) {
			factM *= cont;
			cont--;
		}
		return factM;
	}
	private int factorialN (int n){
		int cont=n,factN=1;
		while (cont > 1) {
			factN *= cont;
			cont--;
		}
		return factN;
	}
	private int factorialResta (int m,int n){
		int cont=m-n,factResta=1;
		while (cont > 1) {
			factResta *= cont;
			cont--;
		}
		return factResta;
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int m,n,factM,factN,factResta,resultado=0;
		
		System.out.print("Introduce un numero: ");
		m = teclado.nextInt();
		while ( m <= 0 ) {
			System.out.print("Por favor, introduce un numero positivo: ");
			m = teclado.nextInt();
		}
		System.out.print("Introduce otro numero igual o menor: ");
		n = teclado.nextInt();
		while ( n <= 0 || n > m  ) {
			System.out.print("Por favor, introduce un numero positivo menor o igual que el primer numero: ");
			n = teclado.nextInt();
		}
		Problema8 f = new Problema8();
		Problema8 h = new Problema8();
		Problema8 r = new Problema8();
		
		if( n > 0 && n <= m) {
			factM = f.factorialM(m);
			factN = h.factorialN(n);
			factResta = r.factorialResta(m, n);
			resultado = factM/(factN*(factResta));
		}
		System.out.print(resultado);
	}
}
