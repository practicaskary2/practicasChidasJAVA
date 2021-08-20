package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona[] misPersonas = new Persona[2];
		
		misPersonas[0] = new Empleado2("Karys Rguez",100000,2008,9,23);
		misPersonas[1] = new Alumno("Juan Perez", "Ingeniería");
		
		for(Persona p : misPersonas) {
		System.out.println(p.getNombre() + "." +  p.getDescripcion());	
		}

	}

}

abstract class Persona{
	private String nombre;
	
	public Persona(String nom) {
		nombre = nom;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public abstract String getDescripcion();
}


class Empleado2 extends Persona{
	
	public Empleado2(String nom,double sue,int agno,int mes,int dia) {
		//Implementa el método constructor de la clase padre
		super(nom);
		
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia); 
		altaContrato = calendario.getTime();
		
	}
	
	public String getDescripcion() {
		return "Este empleado tiene un sueldo de " + sueldo;
	}


public double getSueldo() {
	return sueldo;
}

public Date getAltaContrato() {
	return altaContrato;
}

public void subeSueldo(double porcentaje) {
	double aumento = sueldo * (porcentaje/100);
	sueldo += aumento;
}

private double sueldo;
private Date altaContrato;
}

class Alumno extends Persona{
	
	private String carrera;
	
	public Alumno(String nom,String carr) {
		super(nom);
		carrera = carr;
	}
	
	public String getDescripcion() {
		return "La carrera de este alumno es " + carrera;
	}
}

