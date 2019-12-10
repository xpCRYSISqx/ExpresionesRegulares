package ExpresionesRegulares;

public class Comparadores {
	
	public boolean comprobar(String expresion, String texto) {
		ComprobarExpresiones compExp = new ComprobarExpresiones();
		ComprobarEntrada compEnt = new ComprobarEntrada();
		if(compExp.comprobarExpresion(expresion)) {
			if(compEnt.comprobarTexto(expresion, texto))
				return true;
			else
				return false;
		}
		else
			return false;
	}
}