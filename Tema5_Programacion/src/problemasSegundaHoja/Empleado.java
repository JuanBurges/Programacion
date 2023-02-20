package problemasSegundaHoja;
import java.util.Scanner;

public class Empleado {
	private String nombre;
	private int numeroId;
	private Scanner teclado = new Scanner(System.in);
	
	public Empleado(String nombre) {
		this.nombre = nombre;
	}
	public Empleado(String nombre, int numeroId) {
		this(nombre);
		setNumeroId(numeroId);
	}
	public void leerDatos(String nombre, int numeroId){
		System.out.print("Introduce el nombre del empleado: ");
		nombre = teclado.nextLine();
		this.nombre = nombre;
		System.out.print("Introduce el numero del empleado: ");
		numeroId = teclado.nextInt();
		this.numeroId = numeroId;
		teclado.nextLine();
	}
	public void verDatos(String nombre, int numeroId) {
		System.out.print("El nombre del empleado es "+nombre+",");
		System.out.println("y su numero de Identificacion es "+numeroId+".");
	}
	// getters
	public String getNombre() {
		return nombre;
	}
	public int getNumeroId() {
		return numeroId;
	}
	// setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setNumeroId(int numeroId) {
		this.numeroId = numeroId;
	}
	
	
}//fin clase Empleado