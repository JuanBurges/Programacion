package problemasTema6;

public class Empleado {
	private String nombre;
	private int numero;
	private static int matricula=1;
	
	public Empleado() {
		numero = matricula++;
	}
	
	public Empleado(String nombre) {
		this();
		this.nombre = nombre;
	}
	
	
	// getters
	public String getNombre() {
		return nombre;
	}
	public int getNumero() {
		return numero;
	}
	// setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return nombre+"/"+numero;
	}
	
	
}//fin clase Empleado