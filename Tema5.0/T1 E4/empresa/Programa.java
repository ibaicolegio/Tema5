package empresa;

public class Programa {
	
	public static void main(String[] args) {
		
		TelefonoMovil m1 = new TelefonoMovil("666543210", 50);
		Trabajador t1 = new Trabajador(500, m1);
		
		System.out.println(t1);
		t1.trabajar();
		t1.trabajar();
		System.out.println();
		System.out.println(t1);
	}
}
