import javax.swing.JFrame;

public class Marco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoPlantilla miMarcoPlantilla =  new MarcoPlantilla();
		miMarcoPlantilla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoPlantilla extends JFrame{
	
	public MarcoPlantilla() {
		setBounds(500,100,400,400);
		setVisible(true);
		setTitle("Marco Plantilla");
		
	}
	
}
