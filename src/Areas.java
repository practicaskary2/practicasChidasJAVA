import java.lang.*;
import java.util.Scanner;
import javax.swing.*;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Selecciona una opci�n: \n1.Cuadrado \n2.Rect�ngulo \n3.Tri�ngulo \n4.C�rculo");
		int seleccion = entrada.nextInt();
		
		switch(seleccion) {
		case 1:
			System.out.println("Seleccionaste Cuadrado, introduce el valor de un lado:");
			int lado = entrada.nextInt();
			int area = lado * lado;
			System.out.println("El �rea del cuadrado es: " +  area);
			break;
			
		case 2:
			//System.out.println("Seleccionaste Rect�ngulo, introduce la base y altura");
			int base = Integer.parseInt(JOptionPane.showInputDialog("Base:"));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Altura:"));
			System.out.println("El �rea del Rect�ngulo es: " + (base * altura));
			break;
		}
	}

}
