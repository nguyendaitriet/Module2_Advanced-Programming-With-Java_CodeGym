public class Test {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder("blue",9.8,3.3);
        System.out.println(myCylinder.getCircleRadius());
        System.out.println(myCylinder.getVolume());
        ComparableCircle myCircle1 = new ComparableCircle(5.6,"blue");
        ComparableCircle myCircle2 = new ComparableCircle(5.6,"brown");
        System.out.println(myCircle1.compareTo(myCircle2));
    }
}
