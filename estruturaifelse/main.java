package estruturaifelse;

import java.util.Scanner;

public class main {

	public static void ifelse(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia!");
		} else if (hora < 18) { 
				System.out.println("Boa tarde!");
			} else { 
				System.out.println("Boa noite!");
			}
		sc.close();
		}
	}


