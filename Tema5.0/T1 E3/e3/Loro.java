package e3;

public class Loro extends Ave{

	private char region;
	private String color;
	
	Loro(char sexo, int edad, char region, String color) {
		super(sexo, edad);
		this.region=region;
		this.color=color;
	}
	
	protected void deDondeEres() {
		switch (region) {
			case 'N': 
				System.out.println("Norte");
				break;
			
			case 'S': 
				System.out.println("Sur");
				break;
			
			case 'E': 
				System.out.println("Este");
				break;
			
			case 'O': 
				System.out.println("Oeste");
				break;
			
			default: 
				System.out.println("La region esta mal escrita");
		}

	}
	
	protected void cantar() {
		super.cantar();
		System.out.println("loro bonito");
	}
}
