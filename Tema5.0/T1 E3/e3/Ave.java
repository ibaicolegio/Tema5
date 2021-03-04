package e3;

public class Ave {

	private char sexo;
	private int edad;
	private static int contadorAves;
	private DatosPersonales nombres;
	
	protected Ave(char sexo, int edad) {
		this.sexo=sexo;
		this.edad=edad;
		contadorAves++;
		nombres = new DatosPersonales();
	}
	
	protected int numeroAves() {
		return contadorAves;
	}
	
	protected void quienSoy() {
		System.out.println("sexo " + sexo + " edad " + edad);
	}
	
	protected void cantar() {
		System.out.print(("Mi nombre es " + nombres.getNombreAve() + ", Pio-pio "));
	}


	public void setNombreDuenio(String nombre) {
		nombres.setDuenio(nombre);
	}
	
	public void setNombreAve(String nombre) {
		nombres.setDuenio(nombre);
	}
	

	public void getNombreDuenio() {
		System.out.println(nombres.getDuenio());
	}
	
	public void getNombreAve() {
		System.out.println(nombres.getNombreAve());
	}
	
}
