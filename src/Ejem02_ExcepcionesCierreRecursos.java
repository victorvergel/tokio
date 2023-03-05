import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejem02_ExcepcionesCierreRecursos {
	public static void main(String args[])
	{
		
		//System.out.println("Introduzca un texto");
		System.out.println("Introduzca un numero");
		int datoUsuario=0;
		Scanner teclado=new Scanner(System.in);
		boolean correcto=true;
		do {
			try (teclado){
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
		teclado.next();
		teclado.close();
		System.out.println("El dato introducido es:" + datoUsuario);
		
	}
}
