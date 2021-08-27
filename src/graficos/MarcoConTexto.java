package graficos;
import java.awt.Graphics;
import javax.swing.*;


public class MarcoConTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MiMarcoBase ventana1 = new MiMarcoBase();
		ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MiMarcoBase extends JFrame{
	
	public MiMarcoBase() {
		//setSize(500,500);
		//setLocation(500,300);
		//setBounds incluye lo que hace setSize y setLocation
		setBounds(500,100,400,400);
		setVisible(true);
		setTitle("Ventana con JPanel");
		
		//Crear una instancia de la clase Lamina
		Lamina miLamina = new Lamina();
		add(miLamina);
	}
	
}

class Lamina extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Aprendiendo Swing", 100, 100);
	}
	
}
