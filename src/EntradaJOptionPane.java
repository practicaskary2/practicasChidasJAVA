import javax.swing.*;
public class EntradaJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre");
		String edad = JOptionPane.showInputDialog("Introduce tu edad:");
		int edadParseada = Integer.parseInt(edad);
		System.out.println("Hola " + nombreUsuario + " .El a�o siguiente tendr�s  " + (edadParseada + 1) + " a�os.");
	}

}
