package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PruebaTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoTexto miMarcoTexto = new MarcoTexto();
		miMarcoTexto.setVisible(true);
		miMarcoTexto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoTexto extends JFrame{
	
	public MarcoTexto() {
		setBounds(500,100,400,400);
		setTitle("Marco con cajas de texto");
		
		LaminaTexto miLaminaTexto = new LaminaTexto();
		add(miLaminaTexto);
		
	}
	
}

class LaminaTexto extends JPanel{
	
	JTextField caja1; //Se declara fuera del metodo para poder hacer uso en la clase interna
	
	public LaminaTexto() {
		
		JLabel miEtiqueta = new JLabel("Email:");
		add(miEtiqueta);
		caja1 = new JTextField(20);
		add(caja1);
			
	
		JButton miBoton = new JButton("Comprobar");
		DameTexto miEvento = new DameTexto(); //Clase que maneja el evento
		miBoton.addActionListener(miEvento); //El boton queda a la escucha
		add(miBoton);
		
	
	}
	
	//Clase interna
    //En esta clase se indica que se va a realizar cuando se lance el evento(Hacer click en botón)
	class DameTexto implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(caja1.getText().trim());
		}
		
	}
}




