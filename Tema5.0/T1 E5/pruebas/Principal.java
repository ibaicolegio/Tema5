package pruebas;

import paquete2D.Circulo;
import paquete2D.Rectangulo;
import paquete3D.Cilindro;
import paquete3D.Esfera;

public class Principal {

	public static void main(String[] args) {
		
		Circulo c1=new Circulo(10);
		Rectangulo r1 = new Rectangulo(5,2);
		Cilindro cl1 = new Cilindro(8,2);
		Esfera e1 = new Esfera(3);
		
		System.out.println(c1.area());
		System.out.println(r1.area());
		System.out.println(cl1.volumen());
		System.out.println(e1.volumen());

	}
}
