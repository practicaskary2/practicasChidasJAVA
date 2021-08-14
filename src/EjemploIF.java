import java.util.Scanner;

public class EjemploIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu edad:");
		int edad = entrada.nextInt();
		
		if(edad >= 18) {
			System.out.println("Eres mayor de edad, puedes pasar!");
		}else {
			
			System.out.println("Eres menor de edad, prohibido pasar");
		}
	}
}
