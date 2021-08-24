import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DameLaHora oyente = new DameLaHora();
		
		Timer miTemporizador = new Timer(5000,oyente);
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa OK para detener el programa");
		System.exit(0);
	}

}


class DameLaHora implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		
		Date ahora = new Date();
		System.out.println("Te pongo la hora cada 5 segundos " + ahora);
	} 
}