package Pr19Aug;

public class SumArrary {
	public static void main(String[] args) {
		int a[]= {2,3,6,7,8,9,56,67,78};
		int sum=0;
		
		for(int i=0;i<=a.length-1;i++) {
			sum+=a[i];
		}
		System.out.println(sum);
	}

}
