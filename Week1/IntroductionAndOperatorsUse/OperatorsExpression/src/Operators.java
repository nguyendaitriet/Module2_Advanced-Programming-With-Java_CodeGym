import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter width: ");
        float width = input.nextFloat();
        System.out.print("Enter height: ");
        float height = input.nextFloat();

        double perimeter = (width+height)*2;
        System.out.println("Perimeter is: " + perimeter);

        double area = width*height;
        System.out.println("Area is: " + area);
    }
}
