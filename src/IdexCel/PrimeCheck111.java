package IdexCel;

import java.util.Scanner;

public class PrimeCheck111 {
	public static boolean IsPrime(int num) {
		if(num>=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;				
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enetr the Number:");
		int number = scanner.nextInt();

		if (IsPrime(number)) {
			System.out.println(number + " is a prime Number.");
		} else {
			System.out.println(number + " is not prime Number.");
		}
	}

}
