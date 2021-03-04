package empresa;

public class Programa2 {

	public static void main(String[] args) {
		Empresa e1 = new Empresa("IRM", 500);
		
		Trabajador t1 = new Trabajador();
		
		e1.contratarGerente(t1);
		
		System.out.println(e1.toString());
		
		e1.trabajar();
		e1.trabajar();
		
		System.out.println(e1.toString());
		System.out.println();
		
		Empresa e2 = new Empresa("OTM", 1000);
		
		System.out.println(e2.toString());
		
		e2.trabajar();
		
		System.out.println(e2.toString());
	}
}
