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

class MarcoBotones extends JFrame{
	
	public MarcoBotones() {
	
		setBounds(700,300,500,300);
		setTitle("Botones y Eventos");
		
		LaminaBotones miLaminaBotones = new LaminaBotones();
		add(miLaminaBotones);
	}
	
}

class LaminaBotones extends JPanel implements ActionListener {

	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonVerde = new JButton("Verde");
	 
	public LaminaBotones() {
		add(botonAzul);
		add(botonAmarillo);
		add(botonVerde);
		botonAzul.addActionListener(this);    //1.Objeto Evento -> addActionListener (equivale a "Al hacer click")
										     //2.Objeto Fuente -> botonAzul (Es el objeto que desencadena el evento)
											//3.Objeto Listener -> this (this hace refrencia a la clase LaminaBotones que es la que queda como oyente)
										   //Se le dice al botonAzul que va a desencadenar un evento al hacer click y este evento lo tiene que recibir class LaminaBotones
		
		botonAmarillo.addActionListener(this);  
		botonVerde.addActionListener(this);  
	}
	
	public void actionPerformed(ActionEvent e) { //Este es un evento obligatorio de implementar por la implementación de la interfaz ActionListener
		
		Object botonPulsado = e.getSource();
		if(botonPulsado == botonAzul) {
			setBackground(Color.blue);
		}
		
		else if ((botonPulsado == botonAmarillo)) {
			setBackground(Color.yellow);
		}
		
		else {
			setBackground(Color.green);
		}
		
	}
	
}
