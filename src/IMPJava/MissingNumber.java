package IMPJava;

public class MissingNumber {
	public static void main(String[] args) {
		int array[]= {1,2,3,5,6};
		int num=array.length+1;
		int total=num*(num+1)/2;
		
		for(int number: array) {
			total-=number;
		}
		System.out.println(total);
	}

}
