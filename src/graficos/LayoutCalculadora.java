package graficos;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCalculadora miMarcoLayout = new MarcoCalculadora();
		miMarcoLayout.setVisible(true);
		miMarcoLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoCalculadora extends JFrame{
	
	public  MarcoCalculadora () {
		setBounds(500,100,400,400);
		setTitle("Calculadora");
		
		
		LaminaCalculadoraPrincipal miLaminaLayoutCalculadora = new LaminaCalculadoraPrincipal();
		add(miLaminaLayoutCalculadora,BorderLayout.NORTH);
		
		 LaminaCalculadoraBotones miLaminaConBotones = new LaminaCalculadoraBotones();
		 add(miLaminaConBotones,BorderLayout.CENTER);
		 
		 //pack(); //Con este metodo se le da un tamaño y posición predeterminado a los elementos
		
	}
	
}

class LaminaCalculadoraPrincipal extends JPanel{
	
	public LaminaCalculadoraPrincipal() {
		//Indicarle a el marco/ventana como van a estar acomodados los elementos de la lamina
				setLayout(new BorderLayout());
				JButton cajaTexto = new JButton("0");
				cajaTexto.setEnabled(false);
				add(cajaTexto);
				
				
	}
	
	
}

class LaminaCalculadoraBotones extends JPanel{
	
	public LaminaCalculadoraBotones() {
		setLayout(new GridLayout(3,4));
		add(new Button("1"));
		add(new Button("2"));
		add(new Button("3"));
		add(new Button("4"));
		add(new Button("5"));
		add(new Button("6"));
		add(new Button("7"));
		add(new Button("8"));
		add(new Button("9"));
		add(new Button("10"));
		add(new Button("11"));
		add(new Button("12"));
	
	}
	
	
}


class InsertarNumero implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}










