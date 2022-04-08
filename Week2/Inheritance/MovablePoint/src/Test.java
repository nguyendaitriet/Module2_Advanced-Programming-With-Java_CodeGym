
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MovablePoint newMovablePoint = new MovablePoint(6,10,5,4);
        System.out.println(Arrays.toString(newMovablePoint.getXY()));
        System.out.println(newMovablePoint);
        newMovablePoint.move();
        System.out.println(Arrays.toString(newMovablePoint.getXY()));
    }
}
