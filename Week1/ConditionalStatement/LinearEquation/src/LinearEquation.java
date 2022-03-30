import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        float a = input.nextFloat();
        System.out.print("b = ");
        float b = input.nextFloat();
        System.out.print("c = ");
        float c = input.nextFloat();

        if (a == 0) {
            if (b == c) {
                System.out.println("The given linear equation has infinity numbers of solutions.");
            } else {
                System.out.println("The given linear equation has no solution.");
            }
        } else {
            float x = (c-b)/a;
            System.out.println("The solution of the given linear equation is: " + x);
        }

    }

}
