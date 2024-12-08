package ExceptionHandling;

public class Ex1 {
	public static void main(String[] args) {
		System.out.println("Hello Worlds!");
		int[] arrray= new int[7];
		try {
			int sum=5%0;
			System.out.println(arrray[10]);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		
	}

}
