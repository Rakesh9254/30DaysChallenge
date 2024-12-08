package IMPJava;

import java.util.Scanner;

public class rev0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num= sc.nextInt();
		int reversed=0;
		while(num!=0) {
			reversed=reversed*10+num%10;//4
			num/=10;
		}
		System.out.println(reversed);
		
	}

}
