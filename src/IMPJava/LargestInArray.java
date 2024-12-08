package IMPJava;

public class LargestInArray {
	public static void main(String[] args) {
		int [] array= {1,3,5,6,7,8};
		
		int largest=array[0];
		
		for(int num : array) {
			if(num>largest) {
				largest=num;
			}
		}
		System.out.println(largest);
	}

}
