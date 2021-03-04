package biblioString;

public class Principal {

	public static void main(String[] args) {
		
		
		System.out.println(BiblioString.concatenarInverso());
		
		System.out.println(BiblioString.sustituir("AAAAAaaaaaaaa", 'a', 'A'));
		
		System.out.println(BiblioString.eliminarCar("Holaoooollaaaa", 'o'));
		
		System.out.println(BiblioString.completar$("Hola", 10));
		
		System.out.println("Para Voy a la torre Eiffel devuelve " + BiblioString.palabras("Voy  a la torre  Eiffel"));
		
		BiblioString.verPalabrasAlReves("Estoy en la torre Eiffel");
		
	}
}
