import java.util.*;

public class Uso_Tallas {
	
	//No se pueden crear instancias de un enum, por lo tanto no se puede usar la palabra new
	
	//Esto no es un array, es una clase Talla
	enum Talla {
		//Constantes enumeradas
		MINI("S"),MEDIANO("M"),GRANDE("L"),MUYGRANDE("XL");
		
		//El constructor debe ser private
		private Talla(String abreviatura) {
			this.abreviatura = abreviatura;
		}
		
		public String getAbreviatura() {
			return abreviatura;
		}
			private String abreviatura;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa tu talla: MINI,MEDIANO,GRANDE,MUY_GRANDE");
		
		String entradaDato = entrada.next().toUpperCase();
		
		Talla la_talla = Enum.valueOf(Talla.class, entradaDato);
		System.out.println("Talla=" + la_talla);
		System.out.println("Abreviatura=" + la_talla.getAbreviatura());
		
	

	}

}
