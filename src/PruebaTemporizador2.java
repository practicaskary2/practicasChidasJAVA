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
		
		Reloj miReloj = new Reloj(3000,true);
		miReloj.enMarcha();
		JOptionPane.showMessageDialog(null, "Pulsa OK para terminar el programa");
		System.exit(0);

	}

}

class Reloj{
	private int intervalo;
	private boolean sonido;
	
	public Reloj(int intervalo,boolean sonido) {
		this.intervalo =  intervalo;
		this.sonido = sonido;
	}
	
	public void enMarcha() {
		ActionListener oyente = new DameLaHora2();
		Timer miTemporizador = new Timer(intervalo,oyente);
		miTemporizador.start();
		
	}
	
	
	
	//CLASE INTERNA
	//Solo las clases internas pueden hacer uso del modificador private
	//La ventaja de usar esta clase interna es que tiene acceso a las propiedades de la clase que la engloba, por ejemplo *private boolean sonido;* en este caso
	//Te evitas crear el setter y getter
	private class DameLaHora2 implements ActionListener{
		
		//Método obligatorio por implementar interfaz ActionListener
		public void actionPerformed(ActionEvent evento) {
			
			Date ahora = new Date();
			System.out.println("Muestro la hora cada 3 segundos " + ahora);
			
			if(sonido) {
				Toolkit.getDefaultToolkit().beep();
			}
		}
	}
}
