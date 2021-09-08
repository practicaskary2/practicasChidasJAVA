package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VariosOyentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoOyentes miMarcoPrincipal = new MarcoOyentes();
		miMarcoPrincipal.setVisible(true);
		miMarcoPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoOyentes extends JFrame{
	
	public MarcoOyentes() {
		setBounds(500,100,400,400);
		setTitle("Marco Varios Oyentes");
		
		MiPanel panelsito = new MiPanel();
		add(panelsito);
	}
	
}

class MiPanel extends JPanel{

public MiPanel() {
	
	
	JButton botonNuevaVentana = new JButton("Nueva Ventana"); //Objeto fuente de evento
	
	botonCerrarTodo = new JButton("Cerrar Todo");

	add(botonNuevaVentana);
	add(botonCerrarTodo);
	
	Oyente miOyente = new Oyente();
	botonNuevaVentana.addActionListener(miOyente);
   }

//Clase interna que será la Oyente
private class Oyente implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		MarcoEmergente miMarquitoEmergente = new MarcoEmergente(botonCerrarTodo);
		miMarquitoEmergente.setVisible(true);
		
	}
	
	
}

 JButton botonCerrarTodo; //Se declara fuera del constructor porque después será necesario tener acceso a este botón

}


class MarcoEmergente extends JFrame{
	public MarcoEmergente(JButton botonDePrincipal) {
		contador++;
		
		setTitle("Ventana " + contador);
		setBounds(40*contador,40*contador,300,150);
		
		CerrarTodasLasVentanas oyenteCerrar = new CerrarTodasLasVentanas();
		botonDePrincipal.addActionListener(oyenteCerrar);
		
	}
	
	private class CerrarTodasLasVentanas implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			dispose();
			contador = 0; //Resetea el contador
		}
		
	}
	
	private static int contador = 0; //Se declara como estático para que mentenga el contador consecutivo cada vez que se crea una instancia de MarcoEmergente
}




