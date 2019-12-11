package ExpresionesRegulares;

public class ComprobarEntrada {

	
	public boolean comprobarTexto(String expresion, String texto) {
		expresion = expresion.replace("[", "");
		expresion = expresion.replace("]", "");
		String[] margen = expresion.split("-");
		
		if(expresion.indexOf("*") > 0 && texto.length() >= 1) {
			for(int i = 0; i < texto.length(); i++) {
				//if()
					return true;
			}
		}
		else if(texto.length() == 1) {
			if(texto.charAt(0) >= margen[0].charAt(0) && texto.charAt(0) <= margen[1].charAt(0))
				return true;
		}
		return false;
	}
}