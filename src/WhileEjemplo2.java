import javax.swing.*;
public class WhileEjemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numeroAleatorio = Math.random();
		numeroAleatorio = Math.round(numeroAleatorio * 100);
		int numeroAleatorioReal = (int)numeroAleatorio;
		System.out.println(numeroAleatorioReal);
		
		int entradaUsuario = 0;
		int numeroIntentos = 0;
		
		while(numeroAleatorioReal != entradaUsuario) {
			
			numeroIntentos++;
			entradaUsuario = Integer.parseInt(JOptionPane.showInputDialog("Adivina el n�mero, tienes tres intentos:"));
			
			if (numeroAleatorioReal != entradaUsuario && numeroAleatorioReal < entradaUsuario ) {
				System.out.println("El n�mero a adivinar es menor");
			}
			
			else if (numeroAleatorioReal != entradaUsuario && numeroAleatorioReal > entradaUsuario) {
				System.out.println("El n�mero a adivinar es mayor");
			}
		}
		System.out.println("Adivinaste el n�mero en " + numeroIntentos + " intentos" );
	}
}
