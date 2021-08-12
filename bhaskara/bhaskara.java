package bhaskara;

public class bhaskara {

	public static void calculando(String[] args) {
		// delta = b ao quadrado - 4ac
		//x = -b +- raiz de delta divido por 2.a
		
		double delta, x1, x2;
		int a, b, c;
		a = 4;
		b = 5;
		c = 6;
		
		delta = Math.pow(b, 2.0) - 4*a*c;
		
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b + Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println(x1);
		System.out.println(x2);
		

	}

}
