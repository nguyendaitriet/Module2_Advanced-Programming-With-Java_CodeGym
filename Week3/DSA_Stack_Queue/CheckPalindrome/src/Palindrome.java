import java.util.Locale;
import java.util.Stack;

public class Palindrome {

    public static boolean checkPalindrome(String string) {
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            myStack.push(string.toLowerCase().charAt(i));
        }
        for (int i = 0; i < string.length(); i++) {
            if (string.toLowerCase().charAt(i) != myStack.pop())
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String string1 = "Able was I ere I saw Elba";
        String string2 = "ACVsdg";
//        System.out.println(checkPalindrome(string1));
//        System.out.println(checkPalindrome(string2));
        System.out.println("'" + string1 + "'" + " is " + (checkPalindrome(string1) ? "" : " not ") + " a palindrome.");

    }
}
