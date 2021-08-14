import javax.swing.*;
public class WhileEjemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String psw = "aeiou";
		String entradaUsuario = "";
		
		
		while (!psw.equals(entradaUsuario)) {
			entradaUsuario = JOptionPane.showInputDialog("Ingresa la contraseña: ");
			
			if(!psw.equals(entradaUsuario)) {
				System.out.println("Error intenta de nuevo");
			}	 
		}		
		System.out.println("Bienvenido al sistema!");
	}
}
