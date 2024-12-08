package IMPJava;

public class Swap {
	public static void main(String[] args) {
		int a=10,b=30;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("A : "+ a +" B : " + b);
	}

}
