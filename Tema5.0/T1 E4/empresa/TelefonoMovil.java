package empresa;

public class TelefonoMovil {

	private String numero;
	private int bateria;
	
	public TelefonoMovil() {
		this.numero = "Sin numero";
		this.bateria = 0;
	}

	public TelefonoMovil(String numero, int bateria) {
		this.numero = numero;
		this.bateria = bateria;
	}
	
	public void usar() {
		bateria--;
	}

	public int getBateria() {
		return bateria;
	}
	
	
}
