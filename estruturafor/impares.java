package estruturafor;

import java.util.Scanner;

public class impares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//leia um valor inteiro X (1 <= X <= 1000)
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
	
		//mostre os impares de 1 até X
		//um valor por linha inclusive o X, se for o caso
		for (int i=1; i<=x; i++) {
			if ( i % 2 != 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
