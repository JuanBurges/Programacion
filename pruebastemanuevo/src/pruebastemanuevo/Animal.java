package pruebastemanuevo;

public class Animal {
	int numCrias;
	
	public Animal() {
		System.out.print("Ha nacido un animal");
	}
	
	/**
	 * Transformador que actualiza  el número de crías del animal
	 * 
	 * @return Número de crías del animal
	 */
	public void alimentar() {
		System.out.println("Alimentando al animal...");
	}
	public void visualizaDatos() {
		System.out.println("Crias: "+numCrias);
	}
	public void setNumCrias(int numCrias) {
		this.numCrias = numCrias;
	}
}
