package problemas;

public class Conjunto {
	
	final static int MAX_ELEMETOS = 100;
	private Integer[]tabla = new Integer[MAX_ELEMETOS];
	
	/*Vacia el conjunto de elementos*/
	public void vaciar( ) {
		for (int i=0;i<tabla.length;i++){
			tabla[i]= null;
		}
	}
	
	/*Agrega conjunto de elementos*/
	public boolean agregar(int x ) {
		if(esMiembro(x)) {
			return false;
		}
		for (int i=0;i<tabla.length;i++) {
			if(tabla[i]==null) {
				tabla[i]=x;
				return true;
			}
		}
		return false;
	}
	
	/*Elimina conjunto de elementos*/
	public boolean eliminar(int x ) {
		if (! esMiembro(x)) {
			return false;
		}
		for (int i =0 ;i<tabla.length;i++) {
			if (tabla[i] != null && tabla[i].equals(x)){
					tabla[i]=null;
				}
					return true;
				}
		
		return false;
	}
	
	/*Copia conjunto de elementos*/
	public void copiar(Conjunto c) {
		for (int i=0; i<c.tabla.length;i++) {
			if(c.tabla[i]!=null) {
				agregar(c.tabla[i]);
			}
		}
		
	}
	
	
	/*Comprueba si ya tiene ese elemento que se le pasa*/
	public boolean esMiembro (Integer x) {
		for (int i =0 ;i<tabla.length;i++) {
			if (tabla[i] != null && tabla[i].equals(x)){
				return true;
			}
		}
		return false;
	}
	
	/*Dice si es igual un conjunto de elementos*/
	public boolean esIgual(Conjunto c) {
		for (int i=0;i<tabla.length;i++) {
			if(tabla[i]!= null) {
				if(! c.esMiembro (tabla[i])) {
						return false;
				}
			}
		}
		return false;
	}

	
	/*Iprime conjunto de elementos*/
	public String imprimir( ) {
		String respuesta= "";
		for (int i =0;i<tabla.length;i++) {
			respuesta += tabla[i];
			respuesta += " ";
		}
		return respuesta;
	}
}

/* Para simplificar dice en las posiciones si hay o no con elementos.
private int posicion(int x) {
	for (int i =0 ;i<tabla.length;i++) {
		if (tabla[i] != null && tabla[i].equals(x)){
			return i;
		}
	}
	return -1;
}*/