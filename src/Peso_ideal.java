import javax.swing.*;
public class Peso_ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int peso = 0;
		int estatura = 0;
		
		do {
			int genero = Integer.parseInt(JOptionPane.showInputDialog("Selecciona una opción: \n1.Hombre \n2.Mujer"));
			switch(genero) {
			case 1:
				estatura = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu estatura:"));
				peso = (estatura - 110);
				System.out.println("Tu peso promedio debe ser: " + peso);
				break;
			
			case 2:
				estatura = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu estatura:"));
				peso = (estatura - 120);
				System.out.println("Tu peso promedio debe ser: " + peso);
				break;
			}
		}while(peso > 0);
	}

}
