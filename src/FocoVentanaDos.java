import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.JFrame;

public class FocoVentanaDos extends JFrame implements WindowFocusListener {

	FocoVentanaDos marco1;
	FocoVentanaDos marco2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FocoVentanaDos miv = new FocoVentanaDos();
		miv.iniciar();
	}
	
	public void iniciar() {
		
		marco1 = new FocoVentanaDos();
		marco2 = new FocoVentanaDos();
		
		marco1.setBounds(50,100,600,350);
		marco1.setVisible(true);
		
		marco2.setBounds(700,100,600,350);
		marco2.setVisible(true);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco1.addWindowFocusListener(this);
		marco2.addWindowFocusListener(this);
		
		
	}

	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == marco1) {
			marco1.setTitle("Tengo el foco");
		}else {
			marco2.setTitle("Tengo el foco");
		}
		
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == marco1){
			marco1.setTitle("");
		}else {
			marco2.setTitle("");
		}
		
	}

}
