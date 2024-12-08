package IdexCel;

import java.util.Scanner;

public class primecheck {
	public static boolean Isprime(int num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
				
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int number = scanner.nextInt();
		if (Isprime(number)) {
			System.out.println(number + " is a Prime Number.");
		} else {
			System.out.println(number + " is not Prime Number.");
		}

	}

}
