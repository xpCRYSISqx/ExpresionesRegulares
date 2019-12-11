package ExpresionesRegulares;

import java.util.ArrayList;

public class Comparadores {
	
	public boolean comprobar(String expresion, String texto) {
		
		ComprobarExpresiones compExp = new ComprobarExpresiones();
		ComprobarEntrada compEnt = new ComprobarEntrada();
		
		if (compExp.checkSubexpresiones(expresion)) {
			
			// multiples subexpresiones
			
			ArrayList<String> subexpresiones = compExp.getSubexpresiones(expresion);
			for (int i = 0; i < subexpresiones.size(); i++) {
				if(compExp.comprobarExpresion(subexpresiones.get(i))) {
					if(compEnt.comprobarTexto(subexpresiones.get(i), texto))
						return true;
					else
						return false;
				}
			}
			
		} else {
			
			// solo una expresion
			
			if(compExp.comprobarExpresion(expresion)) {
				if(compEnt.comprobarTexto(expresion, texto))
					return true;
				else
					return false;
			}
		}
		
		return false;
	}
}