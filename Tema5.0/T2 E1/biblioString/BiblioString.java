package biblioString;

public class BiblioString {

	public static String concatenarInverso() {
		int cant=1;
		String resp="", cadena="", cadenaAux="";
		
		while (cant<=10 && !resp.equals("fin")) {
			System.out.println("Introduce cadena de caracteres");
			cadenaAux=Consola.leeString();
			
			cadena=cadenaAux+cadena;
			
			System.out.println("Otra cadena?");
			resp=Consola.leeString();
			cant++;
		}
		return cadena;
	}
	
	public static int sustituir (String cadena, char car1, char car2) {
		int cant, cantSus=0;
		String sustituido;
		cant=cadena.length();
		for (int i = 0; i < cant; i++) {
			if (cadena.charAt(i)==car1)
				cantSus++;
		}
		sustituido=cadena.replace(car1, car2);
		System.out.println(sustituido);
		return cantSus;
	}
	
	public static String eliminarCar(String cadena, char car) {
		String eliminado, carString;
		carString=Character.toString(car);
		eliminado=cadena.replaceAll(carString, "");
		return eliminado;
	}
	
	public static String completar$(String cadena, int longitud) {
		int cant;
		String completada=cadena;
		cant=cadena.length();
		while (cant<longitud) {
			completada=completada+'$';
			cant++;
		}
		return completada;
	}
	
	public static int palabras(String cadena) {
		int cant=1;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i)==' ') {
				cant++;
				while((i < cadena.length())&&(cadena.charAt(i))==(cadena.charAt(i+1))){	
					i++;
				}
			}
		}
		return cant;
	}
	
	public static void verPalabrasAlReves(String cadena) {
		String aux="";
		for (int i = cadena.length()-1; i >= 0; i--) {
			if (cadena.charAt(i)!=' ') {
				aux=cadena.charAt(i)+aux;
			}
			else {
				System.out.println(aux.toLowerCase());
				aux="";
			}
		}
		System.out.println(aux.toLowerCase());
	}
}
