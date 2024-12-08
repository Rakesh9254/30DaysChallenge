package TopString;

public class SplRemove {
    public static void main(String[] args) {
        String str = "$*&&%$@@@$Roshan%#@!#^";

        String str1 = str.replaceAll("[\\$\\*&%@!#^]", "");
        System.out.println(str1);
    }
}