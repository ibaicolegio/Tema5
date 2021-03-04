package vaca;

public class Vaca {
	
	private String colorPelo;
	private int edad;
	private String nombre;
	private static int contadorVacas=1;
	
	public Vaca () {
		colorPelo="Sin color";
		edad=0;
		nombre="Sin nombre";
		System.out.println("Se ha creado la vaca " + contadorVacas);
		contadorVacas++;
	}
	
	public Vaca (int edad, String nombre){
		colorPelo="Sin color";
		this.edad=edad;
		this.nombre=nombre;
		System.out.println("Se ha creado la vaca " + contadorVacas);
		contadorVacas++;
	}
	
	public Vaca (String colorPelo, int edad, String nombre){
		this.colorPelo=colorPelo;
		this.edad=edad;
		this.nombre=nombre;
		System.out.println("Se ha creado la vaca " + contadorVacas);
		contadorVacas++;
	}
	
	public void muu() {
		System.out.println("Muuu...mi nombre es " + nombre + " y mi color de pelo es " + colorPelo);
	}
	
	public void compararEdad(Vaca vaca) {
		if (this.edad>vaca.edad)
			System.out.println("La vaca " + this.nombre + " es mas vieja que la vaca " + vaca.nombre);
		else
			System.out.println("La vaca " + vaca.nombre + " es mas vieja que la vaca " + this.nombre);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
}
