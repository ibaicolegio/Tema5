package figuras;

public class TestFigura {

	public static void main(String[] args) {

		Circulo ci1 = new Circulo(2);
		System.out.println(ci1.getArea());
		Cuadrado cu1 = new Cuadrado(3);
		System.out.println(cu1.getArea());
		Rectangulo r1 = new Rectangulo(4,5);
		System.out.println(r1.getArea());
		
		System.out.println();
		System.out.println(Figura.getAreaTotal());
		System.out.println();
		
		Circulo ci2 = new Circulo(3);
		Circulo ci3 = new Circulo(1);
		System.out.println(Circulo.getAreaTotal());
	}

}
