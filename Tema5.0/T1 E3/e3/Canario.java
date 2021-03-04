package e3;

public class Canario extends Ave {

	private double tamanio;
	
	protected Canario(char sexo, int edad) {
		super(sexo, edad);
	}
	
	protected Canario(char sexo, int edad, double tamanio) {
		super(sexo, edad);
		this.tamanio=tamanio;
	}
	
	protected void altura() {
		if (tamanio>30)
			System.out.println("Alto");
		else {
			if (tamanio<15)
				System.out.println("Bajo");
			else
				System.out.println("Mediano");
		}

	}
}
