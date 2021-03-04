package empresa;

public class Trabajador extends Persona{
	
	private float dinero;
	private TelefonoMovil telefono;
	
	public Trabajador() {
		super();
		telefono = new TelefonoMovil();
		this.dinero = 0;		
	}
	
	public Trabajador(float dinero, TelefonoMovil telefono) {
		super();
		this.dinero = dinero;
		this.telefono = telefono;
	}


	public void ganarDinero(float dinero) {
		this.dinero+=dinero;
	}

	
	public void gastarDinero(float dinero) {
		this.dinero-=dinero;
	}


	public String toString() {
		return super.toString() + ", dinero=" + dinero + ", bateria=" + telefono.getBateria();
	}
	
	public void trabajar() {
		telefono.usar();
		ganarDinero(10);
	}
	
}
