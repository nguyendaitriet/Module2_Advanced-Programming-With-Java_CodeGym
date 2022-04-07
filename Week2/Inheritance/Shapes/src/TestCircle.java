public class TestCircle {
    public static void main(String[] args) {
        Shape circle1 = new Circle();
        System.out.println(circle1);

        Shape circle2 = new Circle(6.7);
        System.out.println(circle2);

        Shape circle3 = new Circle("red",false,3.3);
        System.out.println(circle3);
    }
}
