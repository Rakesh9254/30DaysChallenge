package IMPJava;

public class ArmStrongs {
	public static void main(String[] args) {
		int num = 153,temp=num,sum=0;
		int OrginalNum=num;
		int count=String.valueOf(num).length();
		while(temp!=0) {
			int digit = temp%10;
			sum+=Math.pow(digit, count);
			temp/=10;
		}
		if (sum==num) {
			System.out.println("ArmStrongs");
		}else {
			System.out.println("Not ArmStrongs");
		}
	}

}
