package problemasTema6;
import java.util.Arrays;
import java.util.Scanner;
public class Problema_1{
	public static void main(String args[]) {
		  Scanner teclado = new Scanner(System.in);
		    int[] a = new int[20];
		    int x;
		    int sum=0;
		    int media=0;
		    int sup=0, inf=0, igual=0;
		    System.out.println("Introduce 20 numeros");
		    
		        for (x=0; x<a.length; x++){
		        a[x]=teclado.nextInt();
		        sum+=a[x];
		        	}
		        media=sum/a.length;
		        for(x=0; x<a.length; x++) {
		        	if(a[x]>media)
		        		inf++;
		        	else if(a[x]==media)
		        		igual++;
		        		else
		        			sup++;
		        }	
		        System.out.println("La media es "+media);
		        System.out.println("Hay "+sup+" numeros superiores a la media");
		        System.out.println("Hay "+inf+" numeros inferiores a la media");
		        System.out.println("Hay "+igual+" numeros iguales a la media");
	}
}