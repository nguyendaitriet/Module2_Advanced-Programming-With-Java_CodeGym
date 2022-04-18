public class Test {
    public static void main(String[] args) {
        MyList<String> firstList = new MyList<>();
        firstList.addElementAtPosition(0,"English","Maths","Biology","Literature","Physics");
        System.out.println(firstList);
        firstList.addElementAtPosition(1,"History","Geography","Chemistry");
        System.out.println(firstList);
//        firstList.removeElementAtPosition(5);
//        System.out.println(firstList);
        firstList.removeElementAtPosition(4);
        System.out.println(firstList);
        System.out.println(firstList.contains("History"));
        firstList.clearAllElements();
        System.out.println(firstList);

    }
}
