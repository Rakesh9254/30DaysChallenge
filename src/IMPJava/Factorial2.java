package IMPJava;

public class Factorial2 {
	public static void main(String[] args) {
		int num=5,Factorial =1;
		
		for(int i=1;i<=num;i++) {
			Factorial*=i;
		}
		System.out.println(Factorial);
	}

}
