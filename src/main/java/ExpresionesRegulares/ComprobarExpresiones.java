package ExpresionesRegulares;

import java.util.ArrayList;

public class ComprobarExpresiones {
	
	String[] reglas = {"[a-z]","[0-9]","[A-Z]"};
	char[] reglasExtra = {'*'};
	
	public boolean comprobarExpresion(String expresion) {
		
		if(expresion.indexOf("-") >= 0) {
			if(expresion.length() == 5) {
				return comprobarReglas(expresion);
			} else if(expresion.length() > 5 && comprobarReglas(expresion)){
				return comprobarReglasExtra(expresion);
			}
		}
		return false;
	}
	
	private boolean comprobarReglas(String expresion) {
		for(int i = 0; i < reglas.length; i++) {
			if(expresion.charAt(1) >= reglas[i].charAt(1) && expresion.charAt(3) <= reglas[i].charAt(3))
				return true;
		}
		return false;
	}
	
	private boolean comprobarReglasExtra(String expresion) {
		for(int i = 0; i < reglasExtra.length; i++) {
			for(int j = 4; j < expresion.length(); j++) {
				if(expresion.charAt(j) == reglasExtra[i])
					return true;
			}
		}
		return false;
	}
	
	public boolean checkSubexpresiones(String expresion) {
		ArrayList<String> subexpresiones = getSubexpresiones(expresion);
		if (subexpresiones.size() > 0) {
			return true;
		}
		return false;
	}
	
	public ArrayList<String> getSubexpresiones(String expresion) {
		
		ArrayList<String> subexpresiones = new ArrayList<String>();
		char[] caracteres = null;
		int pos = 0;
		
		if (expresion.indexOf("[") >= 0 && expresion.indexOf("]") >= 0) {
			
			// quitar los corchetes
			expresion = expresion.replace("[", "");
			expresion = expresion.replace("]", "");
			
			caracteres = expresion.toCharArray();
			
			// separar las distintas subexpresiones
			for (int i = 0; i < caracteres.length - 1; i++) {
				//System.out.println(caracteres[i]);
				if(caracteres[i] != '-' && caracteres[i+1] != '-') {
					//System.out.println("si");
					subexpresiones.add(expresion.substring(pos, i+1));
					pos = i+1;
				}
			}
			subexpresiones.add(expresion.substring(pos, caracteres.length));
			
		}
		
		return subexpresiones;
	}
}