package Arrays;

public class ArrayZeroMove {
	public static void main(String[] args) {
		int[] array = { 4, 0, 0, 1, 3, 12 };
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				j++;
			}

		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
	}

}
