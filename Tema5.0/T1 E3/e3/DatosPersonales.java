package e3;

public class DatosPersonales {

	private String nombreAve, duenio;

	public DatosPersonales() {
		this.nombreAve = "No tiene nombre";
		this.duenio = "No tiene nombre";
	}

	public String getNombreAve() {
		return nombreAve;
	}

	public void setNombreAve(String nombreAve) {
		this.nombreAve = nombreAve;
	}

	public String getDuenio() {
		return duenio;
	}

	public void setDuenio(String duenio) {
		this.duenio = duenio;
	}
	
}
