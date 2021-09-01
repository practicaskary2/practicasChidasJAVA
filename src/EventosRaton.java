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
		setTitle("Evento Ratón");
		
		EventosDeRaton eventoRaton = new EventosDeRaton();
		addMouseListener(eventoRaton);
		addMouseMotionListener(eventoRaton);
	}
}

class EventosDeRaton implements MouseListener,MouseMotionListener{  //En caso de no querer declarar todos los métodos se puede usar la clase MouseAdapter -> extends MouseAdapter

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Hiciste click con el ratón");
		//System.out.println("Cordenada X: " + e.getX() + " Cordenada Y: " + e.getY());
		//System.out.println("Hiciste click " + e.getClickCount() + " veces");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Acabas de presionar");
		
		if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("Pulsaste el botón izquierdo del mouse");
		}else if(e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("Pulsaste la rueda del mouse");
		}else if(e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("Pulsaste el botón derecho del mouse");
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
		//System.out.println("El ratón está por encima de la ventana");
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
		System.out.println("Estás moviendo el mouse");
	}
	
}