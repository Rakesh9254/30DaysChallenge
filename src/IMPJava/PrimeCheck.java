package IMPJava;

public class PrimeCheck {
	public static void main(String[] args) {
		int num=12;
		if(num<=1) {
			System.out.println("Not a prime No.");
			return;
		}
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				System.out.println("Not a prime No.");
				return;
			}
		}
		System.out.println("Prime No.");
	}

}
