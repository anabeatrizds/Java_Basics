package exercicios;

public class valorpeca {

	public static void main(String[] args) {
		double cod_p, cod_p1;
		int num, num1;
		double valor, valor1, soma;
		
		cod_p = 12;
		cod_p1 = 16;
		num = 1;
		num1 = 2;
		valor = 5.30;
		valor1 =  5.10;
		soma = valor*num + valor1*num1;
		System.out.printf("VALOR A PAGAR R$ %.2f%n", soma);
		
		
		double cod_p2, cod_p3;
		int num2, num3;
		double valor2, valor3, soma2;
		
		cod_p2 = 13;
		cod_p3 = 161;
		num2 = 2;
		num3 = 4;
		valor2 = 15.30;
		valor3 =  5.20;
		soma2 = valor2*num2 + valor3*num3;
		System.out.printf("VALOR A PAGAR R$ %.2f%n", soma2);
		
		
		double cod_p4, cod_p5;
		int num4, num5;
		double valor4, valor5, soma3;
		
		cod_p4 = 1;
		cod_p5 = 2;
		num4 = 1;
		num5 = 1;
		valor4 = 15.10;
		valor5 =  15.10;
		soma3 = valor4*num4 + valor5*num5;
		System.out.printf("VALOR A PAGAR R$ %.2f%n", soma3);
		

	}

}
