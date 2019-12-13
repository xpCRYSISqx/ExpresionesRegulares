package ExpresionesRegulares;

public class Launcher {

	public static void main(String[] args) {
		Comparadores comparadores = new Comparadores();
		if(comparadores.comprobar("[A-Z0-9]", "Y"))
			System.out.println("Comprobacion exitosa");
		else
			System.out.println("Comprobacion fallida");
	}
}