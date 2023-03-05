import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejem01_ExcepcionesNoDefinidas {
	public static void main(String args[])
	{
		Scanner teclado=new Scanner(System.in);
		//System.out.println("Introduzca un texto");
		System.out.println("Introduzca un numero");
		int datoUsuario=0;
		
		boolean correcto=true;
		do {
			try {
				datoUsuario = teclado.nextInt();
				correcto=true;
			} catch (InputMismatchException entradaErronea) {
				entradaErronea.printStackTrace();
				teclado.next(); //Capturamos el salto de línea
				System.out.println("Introduzca un numero");
				correcto=false;
			} 
		} while (!correcto);
		/* Si introducen un texto se produce java.util.InputMismatchException 
		 https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html#nextInt--
		 */
		teclado.close();
		System.out.println("El dato introducido es:" + datoUsuario);
		
	}
}
