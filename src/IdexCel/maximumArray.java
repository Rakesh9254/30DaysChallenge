package IdexCel;

public class maximumArray {
	public static void main(String[] args) {
		int [] array = {1, 3, 4, 7, 8,67};
		int max = array[0];
		
		for(int num : array) {
			if(num>max) {
				max = num;
			}
		}
		System.out.println(max);
		
	}

}
