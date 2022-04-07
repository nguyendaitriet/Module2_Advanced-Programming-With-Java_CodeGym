public class TestSquare {
    public static void main(String[] args) {
        Square mySquare1 = new Square();
        System.out.println(mySquare1);

        Square mySquare2 = new Square(9);
        System.out.println(mySquare2);
        mySquare2.setSide(7.4);
        System.out.println(mySquare2);
    }
}
