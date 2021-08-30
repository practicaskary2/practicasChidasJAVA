import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;


public class EventosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MimarcoVentanaTeclado evento =  new MimarcoVentanaTeclado();
		evento.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MimarcoVentanaTeclado extends JFrame{
	
	public MimarcoVentanaTeclado() {
		setBounds(500,100,400,400);
		setVisible(true);
		setTitle("Eventos de teclado");
		
		EventosTecladoOyente miVentanilla2 = new EventosTecladoOyente();
		addKeyListener(miVentanilla2);
	}
	
}


//Clase OYENTE
class EventosTecladoOyente implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char letra = e.getKeyChar();
		System.out.println(letra);
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
