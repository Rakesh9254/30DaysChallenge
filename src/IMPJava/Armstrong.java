package IMPJava;

public class Armstrong {

	public static void main(String[] args) {
		int num = 153, sum = 0, temp = num;
		int originalNum = num;

		while (temp != 0) {
			int digit = temp % 10;
			sum += Math.pow(digit, 3);
			temp /= 10;
		}
		if (num == sum) {
			System.out.println(originalNum+ " is an Armstrong number.");
		} else {
			System.out.println(originalNum+ " is not an Armstrong number.");
		}

	}

}
