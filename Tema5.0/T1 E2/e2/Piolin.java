package e2;

public class Piolin extends Canario{

	int numeroPeliculasParticipado;
	
	Piolin(char sexo, int edad, double tamanio, int numeroPeliculasParticipado) {
		super(sexo, edad, tamanio);
		this.numeroPeliculasParticipado=numeroPeliculasParticipado;
	}
	
	public static void main(String[] args) {
		
		Piolin p1=new Piolin('H', 3, 20, 2);
		Loro l1=new Loro('M', 7, 'N', "Rojo");
		
		p1.quienSoy();
		l1.quienSoy();
		
		System.out.println();
		
		p1.altura();
		
		System.out.println();
		
		l1.deDondeEres();
		
		System.out.println();
		
		p1.tamanio=35;
		
		p1.altura();
		
		System.out.println();
		
		l1.region='S';
		
		System.out.println(contadorAves);
	}
}
