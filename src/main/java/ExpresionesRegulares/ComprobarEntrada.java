package ExpresionesRegulares;

public class ComprobarEntrada {

	
	public boolean comprobarTexto(String expresion, String texto) {
		if (expresion.indexOf("[") >= 0 && expresion.indexOf("]") >= 0) {
			expresion = expresion.replace("[", "");
			expresion = expresion.replace("]", "");
			String[] margen = expresion.split("-");
			int inicio = margen[0].charAt(0);
			int fin = margen[1].charAt(0);
			if(inicio <= (int) texto.charAt(0) && fin >= (int) texto.charAt(0))
				return true;
		}
		return false;
	}
	
}