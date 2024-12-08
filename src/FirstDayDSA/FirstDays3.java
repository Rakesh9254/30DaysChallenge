package FirstDayDSA;

import java.util.Scanner;

public class FirstDays3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Values :");
		int a = scanner.nextInt();
		System.out.print("Enter the second :");
		int b = scanner.nextInt();
		if (a == b) {
			System.out.println("Equal");
		} else if (a > b) {
			System.out.println(a + " is greater");
		} else {
			System.out.println(a + " is smaller");
		}
		scanner.close();
	}
}
