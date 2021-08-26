import javax.swing.*;
import java.util.*;
import java.awt.*;
import javax.swing.Timer;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj miReloj = new Reloj();
		miReloj.enMarcha(3000,true);
		JOptionPane.showMessageDialog(null, "Pulsa OK para terminar el programa");
		System.exit(0);

	}

}

class Reloj{
	
	public void enMarcha(int intervalo, boolean sonido) {
		
		//CLASE INTERNA LOCAL
		//No puede tener modificador de acceso
		//No es visible por la clase externa en este caso Reloj
		class DameLaHora2 implements ActionListener{
			
			//Método obligatorio por implementar interfaz ActionListener
			public void actionPerformed(ActionEvent evento) {
				
				Date ahora = new Date();
				System.out.println("Muestro la hora cada 3 segundos " + ahora);
				
				if(sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}
		
		ActionListener oyente = new DameLaHora2();
		Timer miTemporizador = new Timer(intervalo,oyente);
		miTemporizador.start();
		
	}
}
