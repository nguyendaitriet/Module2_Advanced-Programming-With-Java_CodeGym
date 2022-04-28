import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class StringSort {
    public static void selectionSortASCE(char[] array) {
        int min;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[min])
                    min = j;
            if (min != i) {
                char temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }

    public static String getNewString(String string) {
        char[] array = string.toCharArray();
        selectionSortASCE(array);
        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();
        String result = "";
        for (char c : array) {
            stack1.push(c);
        }
        stack2.push(' ');
        while (stack1.size() > 0) {
            if (stack2.peek() != stack1.peek()) {
                stack2.push(stack1.pop());
                continue;
            }
            stack1.pop();
        }
        int size = stack2.size();
        for (int i = 0; i < size; i++) {
            result += stack2.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getNewString("Welcome"));
        System.out.println(getNewString("Welcome"));
    }
}
