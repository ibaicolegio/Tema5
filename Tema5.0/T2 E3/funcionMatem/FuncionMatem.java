package funcionMatem;

public class FuncionMatem {

	private double x;

	public FuncionMatem(double x) {
		this.x = x;
	}
	
	public void evaluar() {
		double resultado, seno, coseno;
		seno=Math.sin(Math.pow(x, 3)+(2*x/9));
		coseno=Math.cos(6*Math.PI+Math.tan(Math.pow(Math.E,Math.pow(x, 3))));
		resultado=Math.sqrt(seno+coseno);
		System.out.println(resultado);
	}
	
	public static void evaluarX(double x) {
		double resultado, seno, coseno;
		seno=Math.sin(Math.pow(x, 3)+(2*x/9));
		coseno=Math.cos(6*Math.PI+Math.tan(Math.pow(Math.E,Math.pow(x, 3))));
		resultado=Math.sqrt(seno+coseno);
		System.out.println(resultado);
	}

	public static void main(String[] args) {
		FuncionMatem f1 = new FuncionMatem(0.0);
		
		f1.evaluar();
		
		evaluarX(1.0);
		
	}
	
}
