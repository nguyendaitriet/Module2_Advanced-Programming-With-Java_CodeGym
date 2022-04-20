import java.util.Stack;

public class Bracket {
    public static boolean checkBracket(String string) {
        Stack<Character> bStack = new Stack<>();
//        char left = '';
        for (int i = 0; i < string.length(); i++) {
            char sym = string.charAt(i);
            if (sym == '(') bStack.push(sym);
            if (sym == ')') {
                if (bStack.isEmpty()) return false;
                if (bStack.pop() == sym) return false;
            }
        }
        return bStack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(checkBracket("s * (s – a) * (s – b) * (s – c)"));
        System.out.println(checkBracket("s * (s – a * (s – b) * (s – c)"));
        System.out.println(checkBracket("s * (s – a) * (s – b) * (s – c)()()"));
    }
}
