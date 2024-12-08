package Pr19Aug;

public class OddEven {
    public static void main(String[] args) {
        int[] a = {2, 3, 6, 7, 8, 9, 56, 67, 78};

        for (int value : a) {
            // Use ternary operator to determine the type
            String type = (value % 2 == 0) ? "Even" : "Odd";
            // Print the result
            System.out.println(type + " is " + value);
        }
    }
}

