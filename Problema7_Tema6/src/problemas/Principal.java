package problemas;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Conjunto c= new Conjunto();
		int numero;
		
		for(int i=0;i<100;i++) {
			numero = teclado.nextInt();
			if (c.agregar(numero)) {
			System.out.println("Agregado "+ numero);	
			}
			if (numero==0)
				break;
		}
		System.out.println("Original "+c.imprimir());
		numero=teclado.nextInt();
		if (c.eliminar(numero)) {
			System.out.println("Eliminado el " +numero);
		}
		c.copiar(c);
		System.out.println("Copia "+c.imprimir());
		
		if (c.esMiembro(4)) {
			System.out.println("Es miembro 4");
		}
		if (!c.esMiembro(6)) {
			System.out.println("No es miembro 6");
		}
		
		
	}
}
