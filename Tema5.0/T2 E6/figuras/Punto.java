package figuras;

public class Punto {

	private double x,y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "("+x+","+y+")";
	}
	
	public double distanciaOrigen() {
		return Math.sqrt(x*x+y*y);
	}
	
	public double calcularDistanciaA(Punto punto) {
		return Math.sqrt((punto.x-x)*(punto.x-x)+(punto.y-y)*(punto.y-y));
	}
	
	public int calcularCuadrante() {
		if (x==0 && y==0) {
			return 0;
		}
		if (x>0 && y>0) {
			return 1;
		}
		if (x<0 && y>0) {
			return 2;
		}
		if (x<0 && y<0) {
			return 3;
		}
		if (x>0 && y<0) {
			return 4;
		}
		return -1;
	}
	public Punto calcularMasCercano(Punto p1, Punto p2, Punto p3) {
		if (p1.distanciaOrigen()<p2.distanciaOrigen()) {
			if (p1.distanciaOrigen()<p3.distanciaOrigen()) {
				return p1;
			}
			else {
				return p3;
				}
		}
		else {
			if (p2.distanciaOrigen()<p3.distanciaOrigen()) {
				return p2;
			}
			else {
				if (p3.distanciaOrigen()<p1.distanciaOrigen()) {
					return p3;
				}
				else {
					return null;
				}
			}
		}
		
	}

	public double getY() {
		return y;
	}
}
