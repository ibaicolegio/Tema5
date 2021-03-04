package paquete2D;

public class Rectangulo {

	private double base, altura;

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double area() {
		double area;
		area=base*altura;
		return area;
	}
}
