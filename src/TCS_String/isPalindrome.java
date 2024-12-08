package TCS_String;

public class isPalindrome {

	public static void main(String[] args) {
		String str="nMadamn";
		str= str.toLowerCase();
		int left=0,right=str.length()-1;
		
		while(left<right){
			if(str.charAt(left)!=str.charAt(right)) {
				System.out.println("Not A Palindrome");
				return;
			}
			left++;
			right--;
		}
		System.out.println("Palindrome");
		
	}

}
