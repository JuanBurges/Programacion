package problemasTema6;

import java.util.Scanner;
import java.util.Arrays;

public class EmpleadoConductor {
	
	public static void main(String[] args) {
		String nombre="";
		int numeroId=0;
		Empleado empleado1 = new Empleado("Jefe");
		empleado1.leerDatos(nombre,numeroId);
		empleado1.verDatos(nombre, numeroId);
		
	}
	
}