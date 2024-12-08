package IMPJava;

public class Fibonacci {
	public static void main(String[] args) {
		int num=10,num1=0,num2=1;
		System.out.print(num1+"," +num2);
		
		for(int i=2;i<num;i++) {
			int num3= num1+num2;
			System.out.print(","+ num3);
			num1 = num2;
			num2= num3;
		}
		System.out.println();
		
	}

}
