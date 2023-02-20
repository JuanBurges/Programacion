package pruebastemanuevo;

public class Persona extends Mamifero {
	String profesion;
	
	public Persona() {
		System.out.print(" y persona");
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	public void setExtremidades(int extremidades) {
		this.extremidades = extremidades;
	}
	public void visualizaDatos() {
		System.out.println("Crias: "+numCrias);
		//System.out.println("Super huesos: "+super.huesos);
		System.out.println("Huesos: "+huesos);
		System.out.println("Extremidades: "+extremidades);
		System.out.println("Extremidades mamifero: "+super.extremidades);
		System.out.println("Profesion: "+profesion);
	}
}
