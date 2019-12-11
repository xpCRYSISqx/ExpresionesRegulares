package ExpresionesRegulares;

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
}