package JavaProgram1;

public class Main {
	public static void main(String[] args) {
		int[] numbers = { -10, -20, -30, -50, -40 };

		int Highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int num : numbers) {
			if (num > Highest) {
				Highest = num;

			} else if(num > secondHighest && num!= Highest) {
				secondHighest = num;
			}
		}
		System.out.println("Highest: " + Highest);
        System.out.println("Second Highest: " + secondHighest);
	}

}
