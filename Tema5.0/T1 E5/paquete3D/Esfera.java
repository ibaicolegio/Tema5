package paquete3D;

public class Esfera {

	private double radio;

	public Esfera(double radio) {
		this.radio = radio;
	}
	
	public double volumen() {
		double volumen, volumenCilindro;
		Cilindro cilindro=new Cilindro(radio, radio);
		volumenCilindro=cilindro.volumen();
		volumen=(2.0/3)*volumenCilindro;
		return volumen;
	}
}
