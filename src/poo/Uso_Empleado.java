package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Empleado empleado1 = new Empleado("Yiya Rguez",100000,2008,9,23);
		Empleado empleado2 = new Empleado("Juan Perez",85500,2002,12,18);
		
		empleado1.subeSueldo(15);
		System.out.println("El sueldo de " + empleado1.getNombre() + " es " + empleado1.getSueldo() + " comenzó a trabajar en " + empleado1.getAltaContrato());*/
		
		Jefatura jefeRH = new Jefatura("Juan Perez", 10000, 2021,8,18);
		jefeRH.setIncentivo(2500);
		
		Empleado[] misEmpleados = new Empleado[6];
		misEmpleados[0] = new Empleado("Yiya Rguez",100000,2008,9,23);
		misEmpleados[1] = new Empleado("Juan Perez",85500,2002,12,18);
		misEmpleados[2] = new Empleado("Luisito Lopez",45000,2001,11,31);
		misEmpleados[3] = new Empleado("Yiya Rguez");
		misEmpleados[4] = jefeRH;  //POLIMORFISMO en acción, principio de sustitución.
		misEmpleados[5] = new Jefatura("Luisito Rey", 20000, 2019,4,4);
		
		//Casting para convertir un tipo de objeto en otro
		Jefatura jefeFinanzas = (Jefatura) misEmpleados[5]; 
		jefeFinanzas.setIncentivo(10000);
		
		
		/*NOTA: Enlazado dinámico es cuando la maquina virtual de java es capaz de saber a que método de 
		la clase padre o de la clase hija, tiene que llamar.
		*/
		
		for(int i=0;i<misEmpleados.length;i++) {
			misEmpleados[i].subeSueldo(15);
		}
		
		//Ordenar usando la Clase Arrays (Esta clase proviene de la API de Java)
		Arrays.sort(misEmpleados);
		
		
		/*Al recorrer el arreglo misEmpleados, el polimorfismo entra en acción al identificar cuando llamar a el método
        de la clase Empleado o de la clase Jefatura
        */
		for(Empleado e: misEmpleados) {
			System.out.println("El sueldo de " + e.getNombre() + " es " + e.getSueldo() + " comenzó a trabajar en " + e.getAltaContrato());
		}
		
	}

}

//Se implementa la interfaz Comparable para hacer uso del método sort de la Clase Arrays
class Empleado implements Comparable{
	
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
	
	//Método obligatorio que proviene de la Interfaz Comparable
	public int compareTo(Object miObjeto) {
		//Casting
		Empleado otroEmpleado = (Empleado) miObjeto;
		
		if(this.sueldo<otroEmpleado.sueldo) {
			return -1;
		}
		
		if(this.sueldo>otroEmpleado.sueldo) {
			return 1;
		}else {
			return 0;
		}
	}
	
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
}

class Jefatura extends Empleado{
	
	public Jefatura(String nom,double sue,int agno,int mes,int dia) {
		super(nom,sue,agno,mes,dia);
	}
	
	public void setIncentivo(double b) {
		incentivo = b;
	}
	
	//Sobreescribir el metodo de la clase padre, en este caso de la clase Empleado
	public double getSueldo() {
		double sueldoJefe = super.getSueldo(); //Almacena en la variable sueldoJefe, la info que viene del método getSueldo de la clase padre -> Empleado
		return sueldoJefe + incentivo;
	}
	
	
	private double incentivo;
	
}





