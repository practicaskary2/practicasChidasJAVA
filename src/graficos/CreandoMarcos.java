package graficos;
import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear una instancia de Mimarco
		Mimarco ventanita = new Mimarco();
		ventanita.setVisible(true);
		ventanita.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Mimarco extends JFrame{
	
	public Mimarco() {
		//setSize(500,500);
		//setLocation(500,300);
		//setBounds incluye lo que hace setSize y setLocation
		setBounds(500,100,400,400);
		setVisible(false);
		setTitle("Primer ventana de kary");
	}
	
}
