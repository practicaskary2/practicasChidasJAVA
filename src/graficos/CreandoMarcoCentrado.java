package graficos;
import javax.swing.*;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCentrado ventanaCentrada = new MarcoCentrado();
		ventanaCentrada.setVisible(true);
		ventanaCentrada.setLocationRelativeTo(null); //Mostar la ventana en medio de la pantalla
		ventanaCentrada.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoCentrado extends JFrame{
	public MarcoCentrado() {
		setSize(400,400);
		setVisible(false);
		setTitle("Ventana centrada");
	}
}
