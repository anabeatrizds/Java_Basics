package estruturaifelse;

import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if (y % z == 0 || z % y == 0) {
			System.out.println("S�O MULTIPLOS");
		} else {
			System.out.println("N�O S�O MULTIPLOS");
		}
		sc.close();

	}

}
