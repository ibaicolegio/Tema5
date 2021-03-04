package figuras;

public class Cuadrado extends Figura{
	
	private static double areaTotal=0;
	
	public Cuadrado(double lado) {
		super.setArea(lado*lado);
		super.setPerimetro(4*lado);
		areaTotal+=super.getArea();
		super.setAreaTotal(super.getAreaTotal()+areaTotal);
	}

}
