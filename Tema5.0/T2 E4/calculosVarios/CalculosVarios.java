package calculosVarios;

import biblioString.Consola;

public class CalculosVarios {
	
	public static void main(String[] args) {
		
		
		
		String str_int1, str_int2;
		str_int1="12";
		str_int2="34";
		
		System.out.println(str_int1+str_int2);
		System.out.println(Integer.parseInt(str_int1)+Integer.parseInt(str_int2));
		System.out.println();
		
		String str_f1, str_f2;
		str_f1="15.5";
		str_f2="4.5f";
		
		System.out.println(str_f1+str_f2);
		System.out.println(Float.parseFloat(str_f1)+Float.parseFloat(str_f2));
		System.out.println();
		
		final Integer n1=20, n2=30;
		int multiplicacion=n1*n2;
		System.out.println(multiplicacion);
		System.out.println();
		
		System.out.println(Math.ceil(2.3));
		System.out.println();
		
		System.out.println(Math.round(2*Math.PI));
		System.out.println();
		
		System.out.println(Math.abs(Math.sin(Math.toRadians(-2))));
		System.out.println();
		
		System.out.println(Math.min(Math.sin(180*Math.PI/180), Math.sin(270*Math.PI/180)));
		System.out.println();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(Math.pow(3, i));
		}
		System.out.println();
		
		System.out.println((int)(Math.random()*11));
		System.out.println();
		
		System.out.println((int)(Math.random()*11+10));
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			System.out.println((int)(Math.random()*11+10));
		}
		System.out.println();
		
		System.out.println("Cuantos dados?");
		int n=Consola.leeInt();
		for (int i = 0; i < n; i++) {
			System.out.println((int)(Math.random()*6+1));
		}
		System.out.println();
		
		
		System.out.println((int)(Math.random()*(-20-10+1)+10));
		System.out.println();
		
		System.out.println((char)('A'+(int)(Math.random()*26)+1));
		
		
		
		
		
	}
}
