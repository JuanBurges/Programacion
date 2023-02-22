package problema;

import java.util.Scanner;

/**
 *
 * @param cadena
 * @return
 */
/*si divisor es mas grande que divididendo resultado 0 sino coger el mismo numero 
 de dividendo que divisor multiplicar el divisor por el numero qe mas lo aproxime al dividendo 
 y restarlo despues añadirle un numero al dividendo */

public class Division {
	String dividendo,divisor;
	
	
	public boolean Dividendo(String dividendo){
		if (dividendo.length()==0) {
		return false;
		}
		for (int i=0;i<dividendo.length();i++) {
			char letra = dividendo.charAt(i);
			if(!(letra>='0'&& letra<='9')) {
				return false;
			}
		}
		return true;
	}
	
public boolean Divisor(String divisor){
	if (dividendo.length()==0) {
		return false;
		}
		for (int i=0;i<dividendo.length();i++) {
			char letra = dividendo.charAt(i);
			if(!(letra>='0'&& letra<='9')) {
				return false;
			}
		}
		return true;
	}
	
	public String Operacion(String resultado) {
		if (dividendo.length()<divisor.length()) {
			resultado= "Resultado: "+0;
		}
		if (dividendo.length()>divisor.length()) {
			for(int i=0; i<dividendo.length();i++) {
				if(divisor.length()==dividendo.length()) {
					
				}
			}
		}
		
		return resultado;
		
	}
		
}
