package IdexCel;

public class ArmStrong {
	public static void main(String[] args) {
		int num=121,sum=0,temp=num;
		int OrgianlNo= num;
		int count = String.valueOf(num).length();
		
		while(temp!=0) {
			int digit = temp%10;
			sum+=Math.pow(digit, count);
			temp/=10;
		}	
		if(sum==num) {
			System.out.println(num+" is ArmStrong.");
		} else {
			System.out.println(num+" is not ArmStrong.");
		}
	}

}
