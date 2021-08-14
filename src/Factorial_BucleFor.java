import javax.swing.JOptionPane;

public class Factorial_BucleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int resultado = 1;
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));
				
		for(int i=numero;i>0;i--) {
			resultado = resultado * i;
		}
		
		System.out.println("El factorial del número " + numero + " es igual a " + resultado);
	}

}
