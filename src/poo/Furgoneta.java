package poo;


//Hereda de la clase Coche
public class Furgoneta extends Coche {

	private int capacidad_carga;
	private int plazas_extras;
	
	public Furgoneta(int capacidad_carga, int plazas_extras  ) {
		super(); //Llamar al m�todo constructor de la clases padre, en este caso Coche
		
		this.capacidad_carga = capacidad_carga;
		this.plazas_extras = plazas_extras;
		
	}
}
