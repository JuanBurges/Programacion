package problemasSegundaHoja;

public class ConductorDisco {
	
	public static void main(String[] args) {
		Disco disco;
		
		disco = new Disco("Hoy es el dia de la croqueta");
		disco.setCanciones(-2);
		disco.setFecha(21,7,2008);
		disco.setPrecio(59.99F);
		System.out.println("El disco se titula: "+disco.getTitulo());
		System.out.println("Contiene "+disco.getCanciones()+" canciones");
		System.out.println("Fue comprado el "+disco.getFecha());
		System.out.println("El precio del disco es "+disco.getPrecio()+" euros.");
		
		
		Disco disco2 = new Disco("Este es otro",8);
		disco2.setFecha(20,5,2007);
		disco.setPrecio(27.10F);
		System.out.println("El disco2 se titula: "+disco2.getTitulo());
		System.out.println("Contiene "+disco2.getCanciones()+" canciones");
		System.out.println("Fue comprado el "+disco2.getFecha());
		System.out.println("El precio del disco es "+disco.getPrecio()+" euros.");
		
	}
	
}