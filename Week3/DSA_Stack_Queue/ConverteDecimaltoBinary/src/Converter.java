import java.util.Stack;

public class Converter {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        int number = 1234;
        while (number > 0) {
            myStack.push(number%2);
            number/=2;
        }
        while (!myStack.isEmpty()) {
            System.out.print(myStack.pop());
        }
    }
}
