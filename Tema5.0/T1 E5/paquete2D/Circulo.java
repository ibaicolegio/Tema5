package paquete2D;

public class Circulo {

	private double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double area() {
		double area;
		area= Math.PI*radio*radio;
		return area;
	}
}
