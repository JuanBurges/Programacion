package problemas;

import java.util.Scanner;

public class Problema6 {
	private int esMultiplo ( int p, int q ) {
		int cont;
		if ( p > q ) {
			cont = p;
		}else {
			cont = q;
		}
		while ( cont % p != 0 || cont % q != 0) {
			cont++;
		}
		return cont;
	}
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int p,q,cont;
		
		System.out.print("Introduce el primer numero: ");
		p = teclado.nextInt();
		while ( p <= 0 ) {
			System.out.print("Deben ser numeros positivos. Introduce otra vez el primer numero: ");
			p = teclado.nextInt();
		}
		System.out.print("Introduce el segundo numero: ");
		q = teclado.nextInt();
		while ( q <= 0 ) {
			System.out.print("Deben ser numeros positivos. Introduce otra vez el segundo numero: ");
			q = teclado.nextInt();
		}
		Problema6 z = new Problema6();
		cont = z.esMultiplo(p,q);
		System.out.println("El M.C.M. de "+p+" y "+q+" es "+cont+".");
	}
}
/* 
 private int (int p,int q)
  for (int divisor =2; divisor<numero; divisor ++)
  if(numero
  
  sattic int exponente (int numero, int primo){
  int dividendo= numero;
  int esp= 0;
  
  do{
	  if(dividendo % primo !=0)
	  return exp;
	  dividendo/=primo;
	  exp++;
 }
 while(dividendo>1);
 	return exp;
 */
 