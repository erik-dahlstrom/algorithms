package CodeFights;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(checkPalindrome("abbac"));
    }
    private static boolean checkPalindrome(String str){
        int front = 0;
        int back = str.length() - 1;
        while (back > front) {
            if (str.charAt(front) != str.charAt(back)) {
                return false;
            }
            ++front;
            --back;
        }
        return true;
    }
}
