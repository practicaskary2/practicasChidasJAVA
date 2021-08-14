
public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = "Karina Rodriguez Arellano";
		System.out.println(nombre);
		System.out.println("Mi nombre tiene " + nombre.length() + " letras");
		System.out.println("La primer letra de mi nombre es: " + nombre.charAt(0));
		
		int ultima_letra = nombre.length();
		System.out.println("La ultima letra de mi nombre es " + nombre.charAt(ultima_letra - 1));
	}

}
