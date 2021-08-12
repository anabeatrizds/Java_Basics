package estruturafor;

import java.util.Scanner;

public class dividirpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fazer um programa para ler um numero N
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//depois leia n pares de numeros e mostre a divisão do primeiro pelo segundo
		//se o denominador for igual a zero, mostre a mensagem "divisão impossivel"
		for(int i=0; i<n; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("divisão impossível");
			} else {
				double div = (double) x/y;
				System.out.printf("%.1f%n", div);
			}
		}
		sc.close();

	}

}
