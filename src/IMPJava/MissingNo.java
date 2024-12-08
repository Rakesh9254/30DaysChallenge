package IMPJava;

public class MissingNo {
	public static void main(String[] args) {
		int[] array = {1,2,3,5,6};
		int length=array.length+1;
		int total= length*(length+1)/2;
		
		for(int num : array) {
			total-=num;
		}
		System.out.println("Misiing Number: "+total);
	}

}
