package figuras;

public abstract class Figura {

	private double area, perimetro;
	private static double areaTotal=0;

	public static double getAreaTotal() {
		return areaTotal;
	}

	public static void setAreaTotal(double areaTotal) {
		Figura.areaTotal = areaTotal;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	
}
