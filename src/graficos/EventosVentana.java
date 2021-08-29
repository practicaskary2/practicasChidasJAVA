package graficos;

import javax.swing.JFrame;
import java.awt.event.*;

public class EventosVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoVentana miVentanita = new MarcoVentana();
		miVentanita.setBounds(300,100,400,400);
		miVentanita.setTitle("Ventana 1");
		miVentanita.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MarcoVentana miVentanita2 = new MarcoVentana();
		miVentanita2.setBounds(800,100,400,400);
		miVentanita2.setTitle("Ventana 2");
		miVentanita2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}


//Crear Ventana
class MarcoVentana extends JFrame {
	
	public MarcoVentana() {
		//setBounds(500,100,400,400);
		//setTitle("Respondiendo");
		setVisible(true);
		
		
		//Instancia de la clase oyente
		M_Ventana ventana_oyente = new M_Ventana();
		addWindowListener(ventana_oyente);  //2.Objeto Fuente -> ¿Quién desencadena la acción? La ventana
		
	}
}

//Clase OYENTE
class M_Ventana implements WindowListener {//3.Objeto Listener

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Cerrando Ventana");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("La ventana ha sido cerrada"); //Este mensaje solo se mostrará con miVentanita2, porque se usa DISPOSE_ON_CLOSE
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("La ventana fue minimizada");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana en primer plano");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana desactivada");
		
	}
	
}