package poo;
import javax.swing.*;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		
		Coche miCoche = new Coche();
		miCoche.setcolor("Rojo");
		
		Furgoneta miFurgoneta = new Furgoneta(7,8000);
		miFurgoneta.setcolor("Azul");
		miFurgoneta.setAsientosCuero("Si");
		
		System.out.println(miCoche.dimeDatosGenerales());
		System.out.println(miFurgoneta.dimeDatosGenerales() + miFurgoneta.dimeDatosFurgoneta());
		
	}

}
