import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FocoVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoFoco miMarcoPlantilla =  new MarcoFoco();
		miMarcoPlantilla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoFoco extends JFrame{
	
	public MarcoFoco() {
		setBounds(500,100,400,400);
		setVisible(true);
		setTitle("Foco Ventana");
		add(new LaminaFoco());
		
	}
	
}

class LaminaFoco extends JPanel {
	
	JTextField campoTexto1;
	JTextField campoTexto2;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//Invalidar el layout del JPanel
		setLayout(null);
		
		campoTexto1 = new JTextField();
		campoTexto2 = new JTextField();
		
		campoTexto1.setBounds(120, 10, 200, 30);
		campoTexto2.setBounds(120, 80, 200, 30);
		add(campoTexto1);
		add(campoTexto2);
		
		//Instancia de la clase Oyente
		LanzaFoco elFoco = new LanzaFoco();
		campoTexto1.addFocusListener(elFoco);
	}
	
	private class LanzaFoco implements FocusListener{ //Clase interna para que pueda tener acceso a campoTexto1 y campoTexto2

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Perdiste el foco");
		}
		
	}
}
