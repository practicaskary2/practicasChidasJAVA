package graficos;

import java.awt.BorderLayout;
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
		LaminaLayout2 miLaminaLayout2 = new LaminaLayout2(); 
		
		//Al agregar las laminas/paneles a el marco/ventana se les tiene que indicar el layout porque si no se sobreponen y solo se mostraría miLaminaLayout2
		add(miLaminaLayout1,BorderLayout.NORTH);
		add(miLaminaLayout2,BorderLayout.SOUTH);
		
	}
	
}

class LaminaLayout1 extends JPanel{
	
	public LaminaLayout1() {
		
		//Indicarle a el marco/ventana como van a estar acomodados los elementos de la lamina
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JButton botonAzul = new JButton("Azul");
		JButton botonAmarillo = new JButton("Amarillo");

		add(botonAzul);
		add(botonAmarillo);
	}
	
	
}


class LaminaLayout2 extends JPanel{
	
	public LaminaLayout2() {
		
		//Indicarle a el marco/ventana como van a estar acomodados los elementos de la lamina
		setLayout(new BorderLayout());
		
		JButton botonVerde = new JButton("Verde");
		JButton botonMorado = new JButton("Morado");
		JButton botonRosa = new JButton("Rosa");
			
		add(botonVerde,BorderLayout.NORTH);
		add(botonMorado,BorderLayout.SOUTH);
		add(botonRosa,BorderLayout.WEST);
	}
	
	
}





















