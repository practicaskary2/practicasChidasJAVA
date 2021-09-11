package graficos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutsPlantilla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoLayout miMarcoLayout = new MarcoLayout();
		miMarcoLayout.setVisible(true);
		miMarcoLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoLayout extends JFrame{
	
	public MarcoLayout() {
		setBounds(500,100,400,400);
		setTitle("Layout");
		
		LaminaLayout miLaminaLayout = new LaminaLayout();
		add(miLaminaLayout);
		
	}
	
}

class LaminaLayout extends JPanel{
	
	public LaminaLayout() {
		JButton botonAzul = new JButton("Azul");
		JButton botonAmarillo = new JButton("Amarillo");
		JButton botonVerde = new JButton("Verde");
			
		
		add(botonAzul);
		add(botonAmarillo);
		add(botonVerde);
	}
	
	
}
