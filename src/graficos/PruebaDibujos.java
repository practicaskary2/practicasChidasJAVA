package graficos;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaDibujos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConDibujos miMarco1 = new MarcoConDibujos();
		miMarco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConDibujos extends JFrame{
	
	public MarcoConDibujos() {
	
		setBounds(500,100,400,400);
		setVisible(true);
		setTitle("Ventana con Dibujos");
		
		LaminaConDibujos miLaminaDibujos = new LaminaConDibujos();
		add(miLaminaDibujos);
	}
	
}

class LaminaConDibujos extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(50, 50, 200, 200);
		g.drawLine(100, 100, 300, 200);
	}
	
}
