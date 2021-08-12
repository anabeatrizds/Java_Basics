package estruturafor;

import java.util.Scanner;

public class fatorialn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ler um valor N
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//calcular e escrever seu respectivo fatorial
		//fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1
		//n! = n . (n-1) . (n-2) . (n-3)!
		//lembrando que, por definição, fatorial de 0 é 1
		int f = 1;
		
		for (int i=1; i <=n; i++) {
			f = f * i;
		}
		System.out.println(f);
		sc.close();
		
	}

}

/* O fatorial de um número n (n pertence ao conjunto dos números naturais) é sempre o produto de todos os seus antecessores, incluindo si próprio e excluindo o zero.

A representação é feita pelo númeor fatorial seguido do sinal de exclamação, n! .

Exemplo de número fatorial: 6! = 6 . 5 . 4 . 3 . 2 . 1 = 720

Importante: n >= 0 (n maior ou igual a zero) , ou seja, não existe fatorial para números negativos. */

//n! = n . (n-1) . (n-2) . (n-3)!

//exemplo: 6! = 6 . (6-1) . (6-2) . (6-3)!
//6! = 6 . 5 . 4 . 3! 6! = 120 . 3!
//6! = 120 . 3 . (3-1) . (3-2)!
//6! = 120 . 3 . 2 . 1!
//6! = 120 . 6 = 720