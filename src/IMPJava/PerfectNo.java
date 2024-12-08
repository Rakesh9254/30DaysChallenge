package IMPJava;

public class PerfectNo {
	public static void main(String[] args) {
		int num =28,sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(num==sum) {
			System.out.println(num+" is a perfect number.");
		}else {
			System.out.println(num+" is a not perfect number.");
		}
	}

}
