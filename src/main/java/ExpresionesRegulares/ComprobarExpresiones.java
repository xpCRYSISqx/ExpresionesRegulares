package ExpresionesRegulares;

public class ComprobarExpresiones {
	
	String[] reglas = {"[a-z]","[0-9]"};
	
	public boolean comprobarExpresion(String expresion) {
		
		for(int i = 0; i < reglas.length; i++) {
			if(reglas[i].equals(expresion))
				return true;
		}
		return false;
	}
}