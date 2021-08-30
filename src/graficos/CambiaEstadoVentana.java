package graficos;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import javax.swing.JFrame;

public class CambiaEstadoVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MimarcoVentana ventanaCambiadora = new MimarcoVentana();
		ventanaCambiadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MimarcoVentana extends JFrame{
	
	public MimarcoVentana() {
		setBounds(500,100,400,400);
		setVisible(true);
		setTitle("Ventana con cambios");
		
		VentanaCambios miVentanilla = new VentanaCambios();
		addWindowStateListener(miVentanilla);
	}
	
}

//Clase OYENTE
class VentanaCambios implements WindowStateListener {

	@Override
	public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("La ventana ha cambiado de estado");
		
		if(e.getNewState() == Frame.ICONIFIED) {
			System.out.println("La ventana está minimizada");
		} else if(e.getNewState() == Frame.MAXIMIZED_BOTH) {
			System.out.println("La ventana está maximizada");
		}
	}
}
