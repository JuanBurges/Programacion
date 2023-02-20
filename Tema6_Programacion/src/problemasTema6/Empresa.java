package problemasTema6;
import java.util.Scanner;

public class Empresa {
	private final int maximoEmpleados=50;
	private Empleado[]Empresa;
	private int listado;
	
	public Empresa(){
		listado=0;
		Empresa = new Empleado[maximoEmpleados];	
	}
	public void insertar(Empleado empleado) {
		if(listado==maximoEmpleados) {
			System.out.println("Limite de tamaño superado");
			return;
		}
		int posicion = 0;
		while (Empresa[posicion] != null) {
			posicion++;
			Empresa[posicion] = empleado;
		}
		if (listado==0) {
			System.out.println("Coleccion vacia");
			return;
		}
		boolean repetido = false;
		posicion=0;
		while (! repetido && posicion<maximoEmpleados ) {
			if (Empresa[posicion].equals(empleado)){
				Empresa[posicion]= null;
				repetido = true;
				listado--;
			}
			posicion++;
		}

	}
}//fin clase Empresa