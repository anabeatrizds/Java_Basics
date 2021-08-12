package exercicios;

public class salario {

	public static void main(String[] args) {
		double sal;
		int numFu;
		double horasTrab, valorHora;
		numFu = 25;
		horasTrab = 100;
		valorHora = 5.50;
		sal = horasTrab * valorHora;
		System.out.println("Number = " + numFu);
		System.out.printf("Salary = U$ %.2f%n", sal);
		
		double sal2;
		int numFu2;
		double horasTrab2, valorHora2;
		numFu2 = 1;
		horasTrab2 = 200;
		valorHora2 = 20.50;
		sal2 = horasTrab2 * valorHora2;
		System.out.println("Number = " + numFu2);
		System.out.printf("Salary = U$ %.2f%n", sal2);
		
		double sal3;
		int numFu3;
		double horasTrab3, valorHora3;
		numFu3 = 6;
		horasTrab3 = 145;
		valorHora3 = 16.55;
		sal3 = horasTrab3 * valorHora3;
		System.out.println("Number = " + numFu3);
		System.out.printf("Salary = U$ %.2f%n", sal3);
	}

}
