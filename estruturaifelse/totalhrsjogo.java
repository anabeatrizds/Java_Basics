package estruturaifelse;

import java.util.Scanner;

public class totalhrsjogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hrInicial= sc.nextInt();
		int hrFinal = sc.nextInt();
		int duration;
		
		if (hrInicial < hrFinal) {
			duration = hrInicial - hrFinal;
		} else {
			duration = 24 - hrInicial + hrFinal;
		}
		
		System.out.println("O jogo durou " + duration + " hora(s)");
		sc.close();

	}

}
