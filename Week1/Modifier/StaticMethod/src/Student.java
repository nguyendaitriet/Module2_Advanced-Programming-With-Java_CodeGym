public class Student {
    private int rollNo;
    private String name;
    private static String college = "VVADBFR";

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public static void change() {
        college = "SDRGHTJ";
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}
