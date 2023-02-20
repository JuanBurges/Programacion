package problemasSegundaHoja;

import java.util.Scanner;

public class ConductorEmpleado {
	public static void main(String[] args) {
		String nombre = "";
		int numeroId = 0;
		Empleado empleado;
		
		
		empleado = new Empleado("Primer empleado");
		empleado.leerDatos(nombre,numeroId);
		nombre = empleado.getNombre();
		numeroId = empleado.getNumeroId();
		empleado.verDatos(nombre,numeroId);
	}
}
