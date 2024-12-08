package JavaProgram1;

public class FibonacciSer {
	public static void main(String[] args) {
		int num=10,n1=1,n=0;
		System.out.print(n+","+n1);
		
		for(int i=2;i< num;i++) {
			int n2=n+n1;
			System.out.print(","+n2);
			n=n1;
			n1=n2;
		}
	}

}
