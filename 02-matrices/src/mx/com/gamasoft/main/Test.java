package mx.com.gamasoft.main;

/**
 * @author Cesar
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arregloUno = new int[10];
		
		for (int i=0; i<=9; i++ ) {
			arregloUno[i] = i+2;
			System.out.println("El n�mero en la posici�n " + i + " es: " + arregloUno[i]);
		}
	}
}