package IMPJava;

public class Armstrongs1 {
	public static void main(String[] args) {
		int n=153,temp = n,sum=0;
		int OrginalNum=n;
		
		while(temp!=0) {
			int digit=temp%10;
			sum+=Math.pow(digit, 3);
			temp/=10;
			
		}
		if(OrginalNum==sum) {
			System.out.println(OrginalNum + " is an Armstrong number.");
		} else {
			System.out.println(OrginalNum + " is not an Armstrong number.");
		}
	}

}
