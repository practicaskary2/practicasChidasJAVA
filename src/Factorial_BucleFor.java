import javax.swing.JOptionPane;

public class Factorial_BucleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int resultado = 1;
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un n�mero"));
				
		for(int i=numero;i>0;i--) {
			resultado = resultado * i;
		}
		
		System.out.println("El factorial del n�mero " + numero + " es igual a " + resultado);
	}

}
