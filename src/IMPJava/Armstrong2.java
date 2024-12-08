package IMPJava;

public class Armstrong2 {
	public static void main(String[] args) {
		int sum=0,num = 1634,temp = num;
		int OrginalNum=num;
		int count = String.valueOf(num).length();
		
		while(temp!=0) {
			int digit = temp%10;
			sum+=Math.pow(digit, count);
			temp/=10;
		}
		
		if(OrginalNum==sum) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
	}

}
