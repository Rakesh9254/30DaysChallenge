package ExceptionHandling;

public class FinallyBlockException {
	public static void main(String[] args) {
		int[] a = new int[7];
		System.out.println("Hello World!");

		try {
			System.out.println(a[9]);
		} catch (Exception e) {
			System.out.println("Exceptioned Handled!");
		} finally {
			System.out.println("I will run always!");
		}
		System.out.println("Bye!");
	}

}
