package poo;


//Hereda de la clase Coche
public class Furgoneta extends Coche {

	private int capacidad_carga;
	private int plazas_extras;
	
	public Furgoneta(int capacidad_carga, int plazas_extras  ) {
		super(); //Llamar al método constructor de la clases padre, en este caso Coche
		
		this.capacidad_carga = capacidad_carga;
		this.plazas_extras = plazas_extras;
		
	}
	
	public String dimeDatosFurgoneta() {
		return "La capacidad de la furgoneta es de: " + capacidad_carga + " y tiene plaza extras para " + plazas_extras + " personas";
	}
}
