package IMPJava;

public class PrimeNumber {
	public static void main(String[] args) {
		int num =11;
		if(num<=1) {
			System.out.println("Not a prime");
			return;
		}
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				System.out.println("Not a prime");
				return;
			}
		}
		System.out.println("Prime No");
		
	}

}
