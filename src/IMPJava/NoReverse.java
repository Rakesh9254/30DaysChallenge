package IMPJava;

public class NoReverse {
	public static void main(String[] args) {
		int num =56789,reversed=0;
		while(num!=0) {
			reversed = reversed*10+num%10;
			num/=10;
		}
		System.out.println(reversed);
	}

}
