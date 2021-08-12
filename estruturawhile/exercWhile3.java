package estruturawhile;

import java.util.Scanner;

public class exercWhile3 {

	public static void main(String[] args) {
		// TODO Um posto de combustivel deseja determinar qual de seus produtos tem a preferencia de seus clientes
		/* Escreva um algoritimo para ler o tipo de combustivel abastecido (codificando da seguinte forma
		 * 1.Alcool
		 * 2.Gasolina
		 * 3.Diesel
		 * 4.Fim
		 * Caso o usuario informe um codigo invalido, deve ser solicitado um novo código até que seja válido. 
		 *O programa sera encerrado quando o codigo informado for o nmero 4
		 *deve ser escrito a mensagem MUITO OBRIGADO e a quantidade de clientes que abasteceram cada tipo de combustivel conforme o exemplo*/
		
		Scanner sc = new Scanner(System.in);
		 int alcool = 0;
		 int gasolina = 0;
		 int diesel = 0;
		 
		 int tipo = sc.nextInt();
		 
		 while (tipo != 4) {
			 if (tipo == 1) {
				 alcool = alcool + 1; //alcool += 1
			 }
			 else if (tipo == 2) {
				 gasolina += 1;
			 }
			 else if (tipo == 3) {
				 diesel += 1;
			 }
			 tipo = sc.nextInt();
		 }
		 
		 System.out.println("MUITO OBRIGADO");
		 System.out.println("Alcool: " + alcool);
		 System.out.println("Gasolina: " + gasolina);
		 System.out.println("Diesel: " + diesel);
		 
		 sc.close();
	}

}
