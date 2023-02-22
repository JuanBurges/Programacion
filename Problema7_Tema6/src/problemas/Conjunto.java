package problemas;

/**
 * Esto es un programa que te da un array de numeros
 * @author yo y mi
 * @version v1.0
 */
public class Conjunto {
	
	final static int MAX_ELEMETOS = 100;
	private Integer[]tabla = new Integer[MAX_ELEMETOS];
	
	/*<h2>Vacia el conjunto de elementos*/
	public void vaciar( ) {
		for (int i=0;i<tabla.length;i++){
			tabla[i]= null;
		}
	}
	
	/*<h2>Agrega conjunto de elementos</2>*/
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
	
	/*<h2>Elimina conjunto de elementos</2>*/
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
	
	/*<h2>Copia conjunto de elementos</2>*/
	public void copiar(Conjunto c) {
		for (int i=0; i<c.tabla.length;i++) {
			if(c.tabla[i]!=null) {
				agregar(c.tabla[i]);
			}
		}
		
	}
	
	
	/*<h2>Comprueba si ya tiene ese elemento que se le pasa</2>*/
	public boolean esMiembro (Integer x) {
		for (int i =0 ;i<tabla.length;i++) {
			if (tabla[i] != null && tabla[i].equals(x)){
				return true;
			}
		}
		return false;
	}
	
	/*<h2>Dice si es igual un conjunto de elementos</2>*/
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

	
	/*<h2>Iprime conjunto de elementos</2>*/
	public String imprimir( ) {
		String respuesta= "";
		for (int i =0;i<tabla.length;i++) {
			respuesta += tabla[i];
			respuesta += " ";
		}
		return respuesta;
	}
}

/* <h3>Para simplificar dice en las posiciones si hay o no con elementos.
private int posicion(int x) {
	for (int i =0 ;i<tabla.length;i++) {
		if (tabla[i] != null && tabla[i].equals(x)){
			return i;
		}
	}
	return -1;
}</3>*/