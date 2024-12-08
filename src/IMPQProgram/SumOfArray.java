package IMPQProgram;

public class SumOfArray {
	public static void main(String[] args) {
		int arr[] = { 2, 5, 6, 7, 8, 9 };
		int sum = 0;
		System.out.println(arr.length);

		for (int i = 0; i <= arr.length - 1; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
}