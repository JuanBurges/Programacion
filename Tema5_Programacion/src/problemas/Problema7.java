package problemas;

import java.util.Scanner;

public class Problema7 {
	private double perimetro(double r) {
		double per;
		per = 2*Math.PI*r;
		return per;
	}
	private double superficie(double r) {
		double area;
		area = Math.PI*r*r;
		return area;
	}
	private double volumen(double r) {
		double vol;
		vol = (4.0/3)*Math.PI*r*r*r;
		return vol;
 	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int opcion;
		double r,per,area,vol;
		
		System.out.print("Introduce el radio: ");
		r = teclado.nextInt();
		System.out.print("Pulsa 1 para saber el perimetro, 2 para la superficie o 3 para el volumen: ");
		opcion = teclado.nextInt();
		while ( opcion < 1 || opcion > 3 ) {
			System.out.print("Por favor, introduce unicamente un numero entre 1,2 y 3: ");
			opcion = teclado.nextInt();
		}
		if ( opcion == 1 ) {
			Problema7 p = new Problema7();
			per = p.perimetro(r);
			System.out.println("El perimetro de un circulo con radio "+r+" vale "+per+".");
		}else if ( opcion == 2 ) {
			Problema7 a = new Problema7();
			area = a.superficie(r);
			System.out.println("El area de un circulo con radio "+r+" vale "+area+".");
		}else {
			Problema7 v = new Problema7();
			vol = v.volumen(r);
			System.out.println("El volumen de una esfera con radio "+r+" vale "+vol+".");
		}
	}
}
