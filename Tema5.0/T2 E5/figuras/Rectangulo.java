package figuras;

public class Rectangulo extends Figura{
	
	private static double areaTotal=0;

	public Rectangulo(double base, double altura) {
		super.setArea(base*altura);
		super.setPerimetro(2*base+2*altura);
		areaTotal+=super.getArea();
		super.setAreaTotal(super.getAreaTotal()+areaTotal);
	}

	
}
