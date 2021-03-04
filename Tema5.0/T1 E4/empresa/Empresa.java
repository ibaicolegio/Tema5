package empresa;

public class Empresa {

	private String nombre;
	private float beneficio;
	private Trabajador duenio, gerente;
	
	
	public Empresa(String nombre, float beneficio, Trabajador duenio) {
		this.nombre = nombre;
		this.beneficio = beneficio;
		this.duenio = duenio;
		this.gerente = new Trabajador();
	}
	
	
	public Empresa(String nombre, float beneficio) {
		this.nombre = nombre;
		this.beneficio = beneficio;
		this.duenio = new Trabajador();
		this.gerente = new Trabajador();
	}


	public void contratarGerente(Trabajador gerente) {
		this.gerente=gerente;	
	}
	
	public void trabajar() {
		this.gerente.trabajar();
		this.duenio.trabajar();
		beneficio+=100;
	}
	
	public String toString() {
		return "nombre=" + nombre + ", beneficio=" + beneficio 
				+ ", [dueño=" + duenio.toString() + "], [gerente=" 
				+ gerente.toString() + "]";
	}
}
