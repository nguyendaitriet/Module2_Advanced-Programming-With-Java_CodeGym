public class Main {

    public static void main(String[] args) {
        Circle myCircle = new Circle(5.5, "blue");
        CircleExtension myCircle2 = new CircleExtension(2,"red");
        myCircle2.getColor();
        myCircle.getRadius();
    }

}
