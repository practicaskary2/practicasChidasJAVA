package poo;

public interface Jefes extends Trabajadores { //Jerarqu�a de interfaces, Jefes hereda de interfaz Trabajadores
	
	//Si no se ponen las palabras public y abstract el programa lo obviar�
	//Ejemplo: String tomarDecisiones(String decision);
	//Se definen los m�todos pero no se desarrollan

	public abstract String tomarDecisiones(String decision);
}
