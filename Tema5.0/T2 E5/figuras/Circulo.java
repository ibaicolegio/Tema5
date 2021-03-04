package figuras;

public class Circulo extends Figura{
	
	private static double areaTotal=0;
	
	public Circulo(double radio) {
		super.setArea(Math.PI*(radio*radio));
		super.setPerimetro(2*Math.PI*radio);
		areaTotal+=super.getArea();
		super.setAreaTotal(super.getAreaTotal()+areaTotal);
	}

}
