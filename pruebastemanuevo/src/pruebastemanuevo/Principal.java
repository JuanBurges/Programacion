/*
 * Conductor de pruebas de la jerarquía de clases de Animal
 */
package pruebastemanuevo;

public class Principal {
	
	public static void main(String[] args) {
		class Coco extends Mamifero{
			int pepe = 4;
			public void visualizaDatos() {
				System.out.println("Crias: "+numCrias);
				//System.out.println("Super huesos: "+super.huesos);
				System.out.println("Huesos: "+huesos);
				System.out.println("Extremidades: "+extremidades);
				System.out.println("Extremidades mamifero: "+super.extremidades);
				System.out.println("Pepe: "+pepe);
			}
		}
		Animal animal;
		Animal mamifero;
		
		animal = new Animal();
		System.out.println();
		animal.numCrias = 3;
		animal.visualizaDatos();
		animal.setNumCrias(5);
		animal.visualizaDatos();
		animal.alimentar();
		
		mamifero = new Mamifero();
		System.out.println();
		mamifero.setNumCrias(4);
		if (mamifero instanceof Mamifero) {
			((Mamifero)mamifero).setExtremidades(4);
			((Mamifero)mamifero).setHuesos(120);
		}
		/*
		 * Mamifero m = (Mamifero)mamifero;
		 * m.setExtremidades(4);
		 * m.setHuesos(120);
		 * 
		 */
		mamifero.alimentar();
		System.out.println("animal\t");
		mamifero.visualizaDatos();
		System.out.println("mamifero------");
		mamifero.visualizaDatos();
		
		Animal persona;
		Animal coco = new Coco();
		persona = new Persona();
		System.out.println();
		//p2 = new Persona();
		persona.setNumCrias(5);
		if (persona instanceof Coco) {
			Coco m = (Coco)persona;
			m.setExtremidades(6);
			m.setHuesos(121);
		}else {
			((Persona)persona).setProfesion("Estudiante");
		}
//		persona.setHuesos(120);
//		persona.setExtremidades(4);
//		persona.setProfesion("Estudiante");
		System.out.println("Persona ----------");
		persona.visualizaDatos();
		System.out.println("Coco ---------");
		coco.visualizaDatos();
		System.out.println("Coco --------- Persona");
		((Persona)coco).visualizaDatos();
	}
}
