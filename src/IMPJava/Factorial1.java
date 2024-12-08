package IMPJava;

public class Factorial1 {
	public static void main(String[] args) {
		int n=5,factorial =1;
		
		for(int i=1;i<=n;i++) {
			factorial*=i;
		}
		System.out.println(factorial);
	}

}
