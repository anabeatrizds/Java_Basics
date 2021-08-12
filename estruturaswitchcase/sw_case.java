package estruturaswitchcase;

import java.util.Scanner;

public class sw_case {

	public static void main(String[] args) {
		//ao inves de utilizar muitos if else - utilizamos switch-case
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		default:
			dia = "Valor inválido";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
		sc.close();
		

	}

}
