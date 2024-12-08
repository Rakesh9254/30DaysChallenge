package FirstDayDSA;

import java.util.Scanner;

public class FirstDays6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the rows :");
		int rows = scanner.nextInt();
		System.out.println("enter the columns :");
		int Columns = scanner.nextInt();

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}

}
