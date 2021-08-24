package poo;

public interface Jefes extends Trabajadores { //Jerarquía de interfaces, Jefes hereda de interfaz Trabajadores
	
	//Si no se ponen las palabras public y abstract el programa lo obviará
	//Ejemplo: String tomarDecisiones(String decision);
	//Se definen los métodos pero no se desarrollan

	public abstract String tomarDecisiones(String decision);
}
