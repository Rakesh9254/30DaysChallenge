package IMPJava;

public class LargestArray2 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 5, 7, 9 };

		int largest = 0;
		for (int num : array) {
			if (num > largest) {
				largest = num;
			}
		}
		System.out.println(largest);
	}

}
