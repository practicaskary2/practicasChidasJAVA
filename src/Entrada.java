import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu nombre:");
		String nombreUsuario = entrada.nextLine();
		
		System.out.println("Introduce tu edad:");
		int edad = entrada.nextInt();
		
		System.out.println("Hola " + nombreUsuario + " tu edad es " + edad);
	}

}
