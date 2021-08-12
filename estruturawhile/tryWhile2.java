package estruturawhile;

import java.util.Scanner;

public class tryWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int soma = 0; //essa var precisa começar com 0 - elemento neutro da soma
		while (x != 0) {
			soma += x; //soma = soma + x
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		sc.close();
		
	}

}
