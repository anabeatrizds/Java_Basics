package estruturawhile;

import java.util.Scanner;

public class exercWhile2 {

	public static void main(String[] args) {
		// TODO escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano
		//para cada ponto escrever o quadrante a q ele pertence
		// o algoritimo sera encerrado quando pelo menos uma das duas coordenadas for NULA
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		while (x != 0 && y > 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			} 
			else if (x < 0 && y > 0) {
				System.out.println("Segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			}
			else {
				System.out.println("Quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();

	}

}
