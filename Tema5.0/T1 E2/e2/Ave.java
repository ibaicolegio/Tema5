package e2;

public class Ave {

	char sexo;
	int edad;
	static int contadorAves;
	
	Ave(char sexo, int edad) {
		this.sexo=sexo;
		this.edad=edad;
		contadorAves++;
	}
	
	int numeroAves() {
		return contadorAves;
	}
	
	void quienSoy() {
		System.out.println("sexo " + sexo + " edad " + edad);
	}
	
}
