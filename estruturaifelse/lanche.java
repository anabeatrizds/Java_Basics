package estruturaifelse;

import java.util.Scanner;

public class lanche {

	public static void main(String[] args) {
		Scanner item = new Scanner(System.in);
		int cod = item.nextInt();
		int qtd = item.nextInt();
		double valor;
		double total;
		
		if (cod == 1) {
			valor = 4;
		} else if (cod == 2){
			valor = 4.5;
		} else if (cod == 3 ) {
			valor = 5;
		} else if (cod == 4) {
			valor = 2;
		} else {
			valor = 1.50;
		}
		
		total = valor * qtd;
		System.out.printf("Total: R$ %.0f%n", total);
		item.close();
	}

}
