package problemasTema6;


public class Coleccion{
	public final int MAX_ELEMENTOS = 100;
	private Disco[]coleccion;
	private int indice;
	
	public Coleccion() {
		indice = 0;
		coleccion = new Disco[MAX_ELEMENTOS];
	}
	public void insertar(Disco disco) {
		if(indice==MAX_ELEMENTOS) {
			System.out.println("Limite de tamaño superado");
			return;
	}
		int pos = 0;
		while(coleccion[pos] != null) 
			pos++;
		coleccion[pos]=disco;
		indice++;
		
	if (indice==0) {
		System.out.println("Coleccion vacia");
		return;
	}
	boolean encontrado = false;
		pos = 0;
		while(! encontrado && pos<MAX_ELEMENTOS) {
			if(coleccion[pos].equals(disco)) {
				coleccion[pos]=null;
				encontrado = true;
				indice--;
			}
			pos++;
		}
	}
}
