package R1Impsheet;

public class FibonacciSer {
	public static void main(String[] args) {
		int n=0,n1=1,num=10;
		System.out.print(n+","+n1);
		
		for(int i=2;i<num;i++) {
			int n2=n+n1;
			System.out.print(","+n2);
			n=n1;
			n1=n2;
		}
	}

}
