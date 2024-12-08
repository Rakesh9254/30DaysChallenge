package TCS_String;

public class StringImmutableExample {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        
        // Since Strings are immutable, str1 and str2 point to the same object in the String pool
        System.out.println(str1 == str2); // Output: true
        
        str1 = str1 + " world";  // A new String object is created here
        
        // str1 now points to a new String object, but str2 still points to the original "hello"
        System.out.println(str1); // Output: hello world
        System.out.println(str2); // Output: hello
        
        // str1 and str2 are no longer the same object
        System.out.println(str1 == str2); // Output: false
    }
}
