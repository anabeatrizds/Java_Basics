package estruturafor;

import java.util.Scanner;

public class caldivisores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// ler um numero inteiro N e calcular todos os seus divisores
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		sc.close();

	}

}
