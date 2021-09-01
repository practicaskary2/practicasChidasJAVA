import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class EventosRaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoRaton marcoRaton = new MarcoRaton();
		marcoRaton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}



class MarcoRaton extends JFrame{
	MarcoRaton(){
		setBounds(500,100,400,400);
		setVisible(true);
		setTitle("Evento Rat�n");
		
		EventosDeRaton eventoRaton = new EventosDeRaton();
		addMouseListener(eventoRaton);
		addMouseMotionListener(eventoRaton);
	}
}

class EventosDeRaton implements MouseListener,MouseMotionListener{  //En caso de no querer declarar todos los m�todos se puede usar la clase MouseAdapter -> extends MouseAdapter

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Hiciste click con el rat�n");
		//System.out.println("Cordenada X: " + e.getX() + " Cordenada Y: " + e.getY());
		//System.out.println("Hiciste click " + e.getClickCount() + " veces");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Acabas de presionar");
		
		if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("Pulsaste el bot�n izquierdo del mouse");
		}else if(e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("Pulsaste la rueda del mouse");
		}else if(e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("Pulsaste el bot�n derecho del mouse");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Acabas de soltar");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("El rat�n est� por encima de la ventana");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Saliste del marco de la ventana");
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Est�s moviendo el mouse");
	}
	
}