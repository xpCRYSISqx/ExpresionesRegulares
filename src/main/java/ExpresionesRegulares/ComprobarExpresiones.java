package ExpresionesRegulares;

public class ComprobarExpresiones {
	
	String[] reglas = {"[a-z]","[0-9]","[A-Z]"};
	
	public boolean comprobarExpresion(String expresion) {
		
		if(expresion.length() == 5) {
			for(int i = 0; i < reglas.length; i++) {
				if(expresion.charAt(1) >= reglas[i].charAt(1) && expresion.charAt(3) <= reglas[i].charAt(3))
					return true;
			}
		}
		return false;
	}
}