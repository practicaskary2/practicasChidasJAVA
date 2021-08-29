package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


/*1.Objeto Evento -> Hacer click en el botón
 * 2.Objeto Fuente (El que desencadena la acción) -> El botón
 * 3.Objeto Listener (El que recibe la acción) -> El JPanel, en este caso miLaminaBotones
 */

public class PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoBotones miMarquito = new MarcoBotones();
		miMarquito.setVisible(true);
		miMarquito.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

//Crear Ventana
class MarcoBotones extends JFrame{
	
	public MarcoBotones() {
	
		setBounds(700,300,500,300);
		setTitle("Botones y Eventos");
		
		LaminaBotones miLaminaBotones = new LaminaBotones();
		add(miLaminaBotones);
	}
	
}

//Crear Panel
class LaminaBotones extends JPanel {

	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonVerde = new JButton("Verde");
	 
	public LaminaBotones() {
		add(botonAzul);
		add(botonAmarillo);
		add(botonVerde);
		
		ColorFondo azul = new ColorFondo(Color.blue);
		ColorFondo amarillo = new ColorFondo(Color.yellow);
		ColorFondo verde = new ColorFondo(Color.green);
		
		botonAzul.addActionListener(azul);    //1.Objeto Evento -> addActionListener (equivale a "Al hacer click")
										     //2.Objeto Fuente -> botonAzul (Es el objeto que desencadena el evento)
											//3.Objeto Listener -> azul (Instancia de la clase ColorFondo que es la que implementa la interfaz ActionListener)
										   //Se le dice al botonAzul que va a desencadenar un evento al hacer click y este evento lo tiene que recibir la instancia de la clase ColorFondo, azul en este caso
		
		botonAmarillo.addActionListener(amarillo);  
		botonVerde.addActionListener(verde);  
		
		
	}
	
	//Clase OYENTE
	//Esta es una clase interna para que pueda hacer uso del método setBackground que pertenece a la clase JPanel heredada en LaminaBotones
	private class ColorFondo implements ActionListener { //Este es un evento obligatorio de implementar por la implementación de la interfaz ActionListener
		
		private Color colorDeFondo;
		
		public ColorFondo(Color c) {
			colorDeFondo = c;
		}
		
		public void actionPerformed(ActionEvent e) {
			setBackground(colorDeFondo); //Método de la Clase JPanel
		}
	}
}



















