package Pr19Aug;

public class StringComparisonDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = "hello";
        
        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.equals(s3): " + s1.equals(s3));
        System.out.println("s1.equals(s4): " + s1.equals(s4));
        System.out.println("s1.equalsIgnoreCase(s4): " + s1.equalsIgnoreCase(s4));
        System.out.println("s1.compareTo(s2): " + s1.compareTo(s2));
        System.out.println("s1.compareTo(s4): " + s1.compareTo(s4));
    }
}
