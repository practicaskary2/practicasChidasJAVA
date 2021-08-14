
public class Calculos_conMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double raiz = Math.sqrt(9);
		System.out.println(raiz);
		
		double redondear = 4.67;
		int resultado = (int) Math.round(redondear);
		System.out.println(resultado);
		
		double base = 5;
		double exponente = 3;
		int resultadoExponente = (int) Math.pow(base, exponente);
		System.out.print(resultadoExponente);
	}

}
