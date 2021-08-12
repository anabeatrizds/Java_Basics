package estruturafor;

import java.util.Scanner;

public class intquadradocubo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//ler um numero inteiro positivo n
		//o programa deve ent mostrar na tela N linhas começando de 1 até N
		//para cada linha, mostrar o numero da linha, depois o numero do quadrado e cubo do valor
		
		for (int i=1; i<=n; i++) {
			int primeiro = i; //mostrar o numero
			int segundo = i * i; //mostrar o n ao quadrado
			int terceiro = i * i * i; //mostrar o n ao cubo
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}
		sc.close();

	}

}
