public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);
        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle1.getArea());

        Rectangle rectangle2 = new Rectangle(5.5,2.2);
        System.out.println(rectangle2);
        System.out.println(rectangle2.getPerimeter());
        System.out.println(rectangle2.getArea());

        Rectangle rectangle3 = new Rectangle("blue", false, 3.2, 7.9);
        System.out.println(rectangle3);
        System.out.println(rectangle3.getPerimeter());
        System.out.println(rectangle3.getArea());
    }
}
