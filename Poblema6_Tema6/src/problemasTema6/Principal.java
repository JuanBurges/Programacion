package problemasTema6;

public class Principal {
	
	public static void main(String[] args) {
		Empleado[] empleados= new Empleado[50];
		final String[] nombres = {"uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
		int creados= 0;
		
		while (creados<50) {
			Empleado i = new Empleado();
			if(Math.random()<0.8) {
				i.setNombre(nombres[(int)(Math.random()*nombres.length)]);
				empleados[creados++]=i;
			}
		}
		for(int i = 0; i<empleados.length;i++) {
			System.out.println("Viualiza datos empleado: " + empleados[i]);
		}
	}
	
}