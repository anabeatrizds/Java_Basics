package estruturafor;

import java.util.Scanner;

public class qtdnuminteiros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//leia um numero inteiro N - este valor sera a quantidade de valores inteiros x que serao lidos em seguida
		int n = sc.nextInt();
		int in = 0;
		int out = 0;
		
		//mostre quantos destes valores X estao dentro do intervalo [10,20]
		//e quantos estao fora do intervalo, mostrando essas informações conforme exemplo 
		//use a palavra "in" para dentro do intervalor e "out" para fora do intervalo
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			if(x >= 10 && x <= 20) {
				in = in + 1;
			} else {
				out = out + 1;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}

}
