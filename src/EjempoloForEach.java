import javax.swing.JOptionPane;

public class EjempoloForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] paises = new String[5];
		
		for(int i=0;i<paises.length;i++) {
			paises[i] = JOptionPane.showInputDialog("Introduce el nombre de un país: " + (i+1));
		}
		
		for(String pais:paises) {
			System.out.println(pais);
		}

	}

}
