package IMPJava;

public class PrimeNu {
	public static void main(String[] args) {
		int num=12;
		if(num<=1) {
			System.out.println("Not a prime No.");
			return;
		}
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				System.out.println("Not a Prime No.");
				return;
			}
			
		}
		System.out.println("prime No.");
	}

}
