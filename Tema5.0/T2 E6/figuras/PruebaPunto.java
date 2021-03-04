package figuras;

import biblioString.Consola;

public class PruebaPunto {

	public static void main(String[] args) {

		System.out.println("Introduce x e y");
		double x=Consola.leeDouble();
		double y=Consola.leeDouble();
		Punto p1 = new Punto(x,y);
		
		System.out.println(p1.toString());
		System.out.println(p1.distanciaOrigen());
		System.out.println(p1.getY());
		System.out.println(p1.calcularCuadrante());
		
		Punto p2 = new Punto(5,3);
		Punto p3 = new Punto(10,10);
		Punto p4 = new Punto(-3,2);
		
		System.out.println(p1.calcularDistanciaA(p2));
		System.out.println(p1.calcularMasCercano(p2, p3, p4));
		
	}

}
