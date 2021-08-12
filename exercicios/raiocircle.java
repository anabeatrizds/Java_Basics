package exercicios;

public class raiocircle {

	public static void main(String[] args) {
		double raio, area, pi;
		raio = 2.0;
		pi = 3.14159;
		area = pi*(Math.pow(raio, 2.0));
		System.out.printf("A = %.4f%n", area);
		
		double raio2, area2, pi2;
		raio2 = 100.64;
		pi2 = 3.14159;
		area2 = pi2*(Math.pow(raio2, 2.0));
		System.out.printf("A = %.4f%n", area2);
		
		double raio3, area3, pi3;
		raio3 = 150.00;
		pi3 = 3.14159;
		area3 = pi3*(Math.pow(raio3, 2.0));
		System.out.printf("A = %.4f%n", area3);
	}

}
