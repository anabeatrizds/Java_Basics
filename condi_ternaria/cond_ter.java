package condi_ternaria;

import java.util.Scanner;

public class cond_ter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//com if else
		/*double preco =  34.5;
		double desconto;
		if (preco < 20.0) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.05;
		}*/
		
		//com o uso da condição ternária
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);   
		
		sc.close();

	}

}
