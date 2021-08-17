package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Empleado empleado1 = new Empleado("Yiya Rguez",100000,2008,9,23);
		Empleado empleado2 = new Empleado("Juan Perez",85500,2002,12,18);
		
		empleado1.subeSueldo(15);
		System.out.println("El sueldo de " + empleado1.getNombre() + " es " + empleado1.getSueldo() + " comenzó a trabajar en " + empleado1.getAltaContrato());*/
		
		Empleado[] misEmpleados = new Empleado[4];
		misEmpleados[0] = new Empleado("Yiya Rguez",100000,2008,9,23);
		misEmpleados[1] = new Empleado("Juan Perez",85500,2002,12,18);
		misEmpleados[2] = new Empleado("Luisito Lopez",45000,2001,11,31);
		misEmpleados[3] = new Empleado("Yiya Rguez");
		
		for(int i=0;i<4;i++) {
			misEmpleados[i].subeSueldo(15);
		}
		
		for(int i=0;i<4;i++) {
			System.out.println("El sueldo de " + misEmpleados[i].getNombre() + " es " + misEmpleados[i].getSueldo() + " comenzó a trabajar en " + misEmpleados[i].getAltaContrato());
		}
		
	}

}

class Empleado{
	
	public Empleado(String nom,double sue,int agno,int mes,int dia) {
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia); 
		altaContrato = calendario.getTime();
		
	}
	
	//Sobrecarga de método constructor
	public Empleado(String nombresito) {
		
		//this en este ejemplo lo que hace es llamar a el otro método constructor
		
		this(nombresito,1000,2021,10,30);
	}
	
	public String getNombre() {
		return nombre;
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
	
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
}
