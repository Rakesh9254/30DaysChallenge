package Pr19Aug;

public class Factorail {
	public static void main(String[] args) {
		int number = 10;
		long factorial = 1;
		
		for(int i=1;i<=number;i++) {
			factorial *= i;
		}
		System.out.println("The Fcatorail of "+ number +" is "+factorial);
	}

}
