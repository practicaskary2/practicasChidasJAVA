package poo;


public class Coche {

	private int ruedas; //Encapsular
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	
	String color;
	int peso_total;
	boolean asientos_cuero,climatizador;
	
	//Método constructor
	public Coche() {
		ruedas = 4;
		largo = 1200;
		ancho = 50;
		motor = 200;
		peso = 5000;
	}
	
	public String dimeLargo(){  //GETTER
		return "El largo del coche es:" + largo;
	}
	
	
	public void setcolor(String color_coche) { //SETTER
		color = color_coche;
	}
	
	public String getColor() { //GETTER
		return "El color del coche es " + color;
	}
	
	public void setAsientosCuero(String asientos_cuero) {
		
		if(asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero = true;
		}else {
			this.asientos_cuero = false;
		}
	}
	
	public String getAsientosCuero() {
		if(asientos_cuero) {
			return "El coche tiene asientos de cuero";
		}else {
			return "El coche tiene asientos de tela";
		}
	}
	
	public int getPrecioTotal() { //GETTER
		
		int precioBase = 100000;
		
		if(asientos_cuero == true) {
			precioBase = precioBase + 40000;
			return precioBase;
			
		} else {
			return precioBase;
		}
	}
	
	public String dimeDatosGenerales() {
		return "La plataforma del vehículo tiene " + ruedas + " ruedas, mide " + largo + " cm de largo, " + ancho + " cm de ancho " + " y tiene un peso de " + peso + " Kg.";
	}
}
