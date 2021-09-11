package graficos;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layout1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoLayout1 miMarcoLayout1 = new MarcoLayout1();
		miMarcoLayout1.setVisible(true);
		miMarcoLayout1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoLayout1 extends JFrame{
	
	public MarcoLayout1() {
		setBounds(500,100,400,400);
		setTitle("Layout1");
		
		LaminaLayout1 miLaminaLayout1 = new LaminaLayout1(); 
		add(miLaminaLayout1);
	}
	
}

class LaminaLayout1 extends JPanel{
	
	public LaminaLayout1() {
		
		//Indicarle a el marco/ventana como van a estar acomodados los elementos de la lamina
		setLayout(new FlowLayout(FlowLayout.CENTER,40,100));
		
		JButton botonAzul = new JButton("Azul");
		JButton botonAmarillo = new JButton("Amarillo");
		JButton botonVerde = new JButton("Verde");
			
		
		add(botonAzul);
		add(botonAmarillo);
		add(botonVerde);
	}
	
	
}
