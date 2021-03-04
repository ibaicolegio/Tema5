package empresa;

public class Persona {

	private String nombre, dni;
	private int altura, peso;
	
	public Persona() {
		this.dni = "Sin DNI";
		this.nombre = "Sin nombre";
		this.altura = 0;
		this.peso = 0;
	}

	public Persona(String nombre, String dni, int altura, int peso) {
		this.nombre = nombre;
		this.dni = dni;
		this.altura = altura;
		this.peso = peso;
	}

	public Persona(String dni) {
		this.dni = dni;
		this.nombre = "Sin nombre";
		this.altura = 0;
		this.peso = 0;
	}

	public String toString() {
		return "nombre=" + nombre + ", peso=" + peso;
	}
	
	
	
}
