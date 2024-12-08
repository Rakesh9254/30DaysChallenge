package FirstDayDSA;

import java.util.Scanner;

public class FirstDays5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt user to enter the number of rows
		System.out.print("Enter the number of rows: ");
		int rows = scanner.nextInt();

		// Prompt user to enter the number of columns
		System.out.print("Enter the number of columns: ");
		int columns = scanner.nextInt();

		// Nested loops to print the pattern
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				// Print '*' at the borders, otherwise print ' '
				if (i == 1 || i == rows || j == 1 || j == columns) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			// Move to the next line after each row
			System.out.println();
		}

		// Close the scanner
		scanner.close();
	}
}
