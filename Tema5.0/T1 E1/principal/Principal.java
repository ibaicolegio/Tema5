package principal;

import vaca.Vaca;

public class Principal {

	public static void main(String[] args) {
		
		Vaca miVaca1=new Vaca();
		Vaca miVaca2=new Vaca(18, "Jacinto");
		Vaca miVaca3=new Vaca("Marron", 5, "Javier");
		
		System.out.println("IBAI");
		
		miVaca1.muu();
		miVaca2.muu();
		miVaca3.muu();
		
		System.out.println();
		
		miVaca1.compararEdad(miVaca2);
		
		System.out.println();
		
		System.out.println(miVaca1.getNombre());
		
		System.out.println();
		
		miVaca1.setEdad(miVaca1.getEdad()+1);
		System.out.println(miVaca1.getEdad());
	}
	
}
