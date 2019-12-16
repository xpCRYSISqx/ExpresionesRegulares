package ExpresionesRegulares;

public class Launcher {

	public static void main(String[] args) {
		Comparadores comparadores = new Comparadores();
		if(comparadores.comprobar("[A-Z0-9]", "1"))
			System.out.println("Comprobacion exitosa");
		else
			System.out.println("Comprobacion fallida");
	}
}