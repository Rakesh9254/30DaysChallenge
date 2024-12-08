package IMPJava;

public class LargestArray {
	public static void main(String[] args) {
		int array[]= {3,4,7,1,23,56};
		int largest=0;
		
		for(int num : array) {
			if(num>largest) {
				largest=num;
			}
		}
		System.out.println(largest);
	}

}
