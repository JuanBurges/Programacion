package problemasTema6;

public class Disco {
	private String titulo;
	private int canciones;
	private float precio;
	private Fecha fechaCompra;
	
	public Disco (String titulo) {
		this.titulo = titulo;
	}
	public Disco (String titulo, int canciones) {
		this(titulo);
		setCanciones(canciones);
	}
	// getters
	public String getTitulo() {
		return titulo;
	}	
	public int getCanciones() {
		return canciones;
	}
	public float getPrecio() {
		return precio;
	}
	public String getFecha() {
		return ""+fechaCompra;
	}
	//setters
	public void setCanciones(int canciones) {
		if (canciones>0)
			this.canciones = canciones;
		else {
			System.out.print("El numero de canciones es erroneo");
		}
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public void setFecha(int dia,int mes,int anno) {
		fechaCompra = new Fecha (dia, mes, anno);
	}
	
}

class Fecha{
	int dia, mes, anno;
	
	public Fecha(int dia,int mes,int anno) {
		this.dia=dia;
		this.mes=mes;
		this.anno=anno;
	}
	
	public String toString() {
		return dia +"/"+mes+"/"+anno;
	}
}