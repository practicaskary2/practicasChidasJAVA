package poo;
import javax.swing.*;

public class UsoClase {

	public static void main(String[] args) {
		
		Coche mazda = new Coche();
		mazda.setcolor("Negro");
		
		System.out.println(mazda.getColor());
		
		mazda.setAsientosCuero(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
		System.out.println(mazda.getAsientosCuero());
		System.out.println("El precio del auto es de: $" + mazda.getPrecioTotal());
		
	}

}
