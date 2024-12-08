package JavaProgram1;

public class Factorial {
	public static void main(String[] args) {
		int num=10,factorail=1;
		
		for(int i=1;i<=num;i++) {
			factorail*=i;
		}
		System.out.println(factorail);//3,628,800.
	}

}
