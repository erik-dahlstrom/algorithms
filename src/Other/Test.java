package Other;

public class Test {
    public static void main(String[] args) {
        System.out.println(reverseString("this is a string"));
    }
    private static String reverseString (String str) {
        StringBuilder reverse = new StringBuilder(str);
        reverse.reverse();
        return reverse.toString();
    }
}

