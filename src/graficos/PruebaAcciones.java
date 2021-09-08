package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;


public class PruebaAcciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoAcciones miMarcoAcciones =  new MarcoAcciones();
		miMarcoAcciones.setVisible(true);
		miMarcoAcciones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoAcciones extends JFrame{
	
	public MarcoAcciones() {
		setBounds(500,100,400,400);
		
		setTitle("Mi marco acciones");

		PanelAccion miPanelBotones = new PanelAccion();
		add(miPanelBotones);
		
	}
	
}


class PanelAccion extends JPanel {

public PanelAccion() {
	
	//Instancias de la clase oyente
	AccionColor accionAzul = new AccionColor("Azul",Color.BLUE);
	AccionColor accionAmarillo = new AccionColor("Amarillo",Color.YELLOW);
	AccionColor accionVerde = new AccionColor("Verde",Color.GREEN);
	
	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonVerde = new JButton("Verde");
	
	add(new JButton(accionAzul));
	add(new JButton(accionAmarillo));
	add(new JButton(accionVerde));
	
	
	/*add(botonAzul);
	add(botonAmarillo);
	add(botonVerde);*/
	
	
	InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
	
	//Agrega un vínculo entre la combinación de teclas y la acción -> keyStroke to actionMapKey
	mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");
	mapaEntrada.put(KeyStroke.getKeyStroke("ctrl Y"), "fondo_amarillo");
	mapaEntrada.put(KeyStroke.getKeyStroke("ctrl G"), "fondo_verde");
	
	//Crear un mapa de acción 
	ActionMap mapaAccion = getActionMap();
	
	mapaAccion.put("fondo_azul", accionAzul);
	mapaAccion.put("fondo_amarillo", accionAmarillo);
	mapaAccion.put("fondo_verde", accionVerde);
	
	
	}

private class AccionColor extends AbstractAction {
	
	public AccionColor(String nombre,Color colorBoton) {
		putValue(Action.NAME,nombre);
		putValue(Action.SHORT_DESCRIPTION,"El botón es color " + nombre);
		putValue("colorDeFondo",colorBoton);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) { //Se indica que tiene que hacer cuando los botones sean pulsados
		// TODO Auto-generated method stub
		
		//getValue corresponde a la clase JPanel, por eso se modifica la clase AccionColor para que sea interna y reconozca el método
		Color c = (Color)getValue("colorDeFondo");
		setBackground(c);
		System.out.println("El color del botón es: " + getValue(Action.NAME));
	} 	
  }
}



