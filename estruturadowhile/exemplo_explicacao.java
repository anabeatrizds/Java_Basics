package estruturadowhile;

import java.util.Locale;
import java.util.Scanner;

public class exemplo_explicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Faça um programa para ler uma temperatura em Celsius e mostrar o
		 * equivalente em Fahrenheit
		 * perguntar se o usuario deseja repetir (s/n)
		 * se S, repetir o programa
		 * 
		 * Formula F= 9c/5+32 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		do  {
			System.out.print("Digite a temperatura em Celsius: ");
			double C =sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F); // 1 - 1 casa decimal
			System.out.print("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		
		sc.close();
	}

}
