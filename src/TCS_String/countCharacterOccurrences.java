package TCS_String;

public class countCharacterOccurrences {
    public static int countCharacterOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "Madam";
        char ch = 'm';
        System.out.println("Occurrences of '" + ch + "' in '" + str + "': " + countCharacterOccurrences(str, ch));
    }
}