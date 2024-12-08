package IMPJava;

public class Prime1 {
	public static void main(String[] args) {
		int n=14;
		if(n<=1) {
			System.out.println("Not a prime.");
			return;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				System.out.println("Not a Prime.");
				return;
			}
		}
		System.out.println("Prime");

	}
}
