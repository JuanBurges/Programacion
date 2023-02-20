package problemasTema6;
import java.util.Scanner;

public class DiscoConductor {


	public static void main(String[] args) {
		Coleccion coleccion;
		Disco disco1 = new Disco("Neri");;
		coleccion = new Coleccion();
		disco1.setCanciones(10);
		disco1.setFecha(16, 8, 2003);
		disco1.setPrecio(20.50f);
		coleccion.insertar(disco1);
		
		System.out.println("Titulo: "+disco1.getTitulo());
		System.out.println("Canciones: "+disco1.getCanciones());
		System.out.println(disco1.getFecha());
		System.out.println(disco1.getPrecio()+" euros");	
	}
	
	
	
	
	
	
	


}

