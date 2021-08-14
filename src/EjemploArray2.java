
public class EjemploArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numerosAleatorios = new int[10];
		
		
		for(int i=0;i<numerosAleatorios.length;i++) {
			numerosAleatorios[i] = (int) Math.round(Math.random()*100) ;
		}
		
		for(int numero:numerosAleatorios) {
		 System.out.println(numero);	
		}
		
	}

}
