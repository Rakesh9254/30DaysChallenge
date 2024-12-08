package JavaInterviewP;

public class SecondLargestNo {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int largest =Integer.MIN_VALUE;
		int Secondlargest =Integer.MIN_VALUE;	
		for(int num : array) {
			if(num>largest) {
				Secondlargest = largest;
				largest= num;
			} else if (num>Secondlargest && num!=largest) {
				Secondlargest = num;
			}		
		}
		System.out.println(largest);
		System.out.println(Secondlargest);	
	}

}
