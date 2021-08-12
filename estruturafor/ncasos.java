package estruturafor;

import java.util.Scanner;

public class ncasos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//leia 1 valor inteiro N
		//esse valor vai representar o numero de casos de teste q vem a seguir
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//cada caso de teste consiste de 3 valores reais
		//cada um deles com uma casa decimal
		//apresente a média ponderada para cada um destes conjuntos de 3 valores
		//sendo que o primeiro valor tem peso 2
		//o segundo valor tem peso 3
		//o terceiro valor tem peso 5
		
		for (int i=0; i<n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
			
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();
	}

}
