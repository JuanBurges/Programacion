/*
 * Representacion de un mamífero, basada en un animal
 */
package pruebastemanuevo;
/*
 * @author alu
 * 
 */
public class Mamifero extends Animal {
	
	int huesos;
	int extremidades;
	public Mamifero() {
		System.out.print(", mamifero");
	}
	/**
	 * Transformador qeu actualiza el número de huesos
	 * 
	 * @param huesos Número de huesos del mamífero
	 */
	public void setHuesos(int huesos) {
		this.huesos = huesos;
	}
	public void setExtremidades(int extremidades) {
		this.extremidades = extremidades;
	}
	public void visualizaDatos(){
		super.visualizaDatos();
		System.out.println("Huesos: "+huesos);
		System.out.println("Extremidades: "+extremidades);
	}
}
