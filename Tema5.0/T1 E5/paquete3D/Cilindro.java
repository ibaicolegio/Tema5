package paquete3D;

import paquete2D.Circulo;

public class Cilindro {

	private double radio, altura;

	public Cilindro(double radio, double altura) {
		this.radio = radio;
		this.altura = altura;
		
	}
	
	public double volumen() {
		double volumen, area;
		Circulo circulo=new Circulo(this.radio);
		area=circulo.area();
		volumen=area*this.altura;
		return volumen;
	}
}
