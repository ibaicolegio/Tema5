package e3;

public class Principal {

	public static void main(String[] args) {

		Piolin p1 = new Piolin('H', 5, 13, 4);
		Piolin p2 = new Piolin('M', 3, 14, 0);
		Piolin p3 = new Piolin('M', 17, 40, 8);
		
		p1.setNombreAve("Ramon");
		p2.setNombreDuenio("Iker");
		
		Loro l1 = new Loro('M', 3, 'E', "Azul");
		
		p1.cantar();
		p2.cantar();
		p3.cantar();
		l1.cantar();
		
		System.out.println();
		
		p1.getNombreDuenio();
		p1.getNombreAve();

		}

}
