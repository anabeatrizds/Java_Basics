package scanner;

import java.util.Scanner;

public class scannerr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		
		String x;
		x = sc.next(); //isso espera a digita��o primeiro antes de ler
		System.out.println("Voce digitou: " + x); //depois imprime
		
		int y;
		y = sc.nextInt();
		System.out.println(y);
		
		double a;
		a = sc.nextDouble();
		System.out.println("Voc� digitou %.2f %n : " + a);
		
		char n;
		n = sc.next().charAt(0);
		System.out.println("Voc� digitou " + n);
		
		sc.close(); 
	}

}
