package IdexCel;

public class maximumArray1 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,5,6,9,10};
		int max = arr[0];
		
		for(int num : arr) {
			if(num>max) {
				max=num;
			}
		}
		System.out.println(max);
	}

}
