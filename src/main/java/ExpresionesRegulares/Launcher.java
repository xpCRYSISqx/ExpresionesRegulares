package ExpresionesRegulares;

public class Launcher {

	public static void main(String[] args) {
		Comparadores comparadores = new Comparadores();
		if(comparadores.comprobar("[5-7]", "62"))
			System.out.println("Comprobacion exitosa");
		else
			System.out.println("Comprobacion fallida");
	}
}