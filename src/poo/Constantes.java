package poo;

public class Constantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crear instancias de la clase Empleado
		Empleadito empleado1 = new Empleadito("Yiya");  //Lo que va despu�s de la palabra reservada new, es el constructor
		Empleadito empleado2 = new Empleadito("Juan"); 
		
		empleado1.cambiaSeccion("RH");
		
		System.out.println(empleado1.devuelveDatos());
		System.out.println(empleado2.devuelveDatos());
	}

}

class Empleadito{
	
	//final es la palabra reservada para declarar una constante
	private final String nombre;
	private String seccion;
	
	//M�todo constructor que recibe un par�metro
	public Empleadito(String nom) {
	
		nombre = nom;
		seccion = "Administraci�n";
	}
	
	public void cambiaSeccion(String seccion) {  //SETTER
		this.seccion = seccion;
	}
	
	public String devuelveDatos() { //GETTER
		return "El nombre del empleado es " + nombre + " y pertenece a la seccion " + seccion;
	}
	
}
