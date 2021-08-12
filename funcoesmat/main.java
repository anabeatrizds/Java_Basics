package funcoesmat;

public class main {

	public static void calculo(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		//A recebe a raiz quadrdada
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadada de " + x + " = " + A);
		System.out.println("Raiz quadada de " + y + " = " + B);
		System.out.println("Raiz quadada de 25 = " + C);
		
		//A recebe o resultado de x elevado a y
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0); //B recebe resultado de x elevado ao quadrado
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		//A recebe o valor absoluto de Y
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);

	}

}
