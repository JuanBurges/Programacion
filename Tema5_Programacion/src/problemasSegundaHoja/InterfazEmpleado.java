package problemasSegundaHoja;

import java.util.Scanner;

public class InterfazEmpleado{
	static private Scanner teclado = new Scanner(System.in);
	private Empleado empleado;
	
	public InterfazEmpleado( Empleado empleado ) {
		this.empleado = empleado;
	}
	public void verDatos(String nombre, int numeroId){
		System.out.println(empleado.getNombre());
		System.out.println(empleado.getNumeroId());
		
	}
	public void leerDatos(String nombre, int numeroId){
		empleado.setNombre(teclado.nextLine());
	
	}
}//cierre clase 