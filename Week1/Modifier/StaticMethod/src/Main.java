public class Main {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(101, "An");
        Student s2 = new Student(280, "Phuong");
        Student s3 = new Student(033, "Hoang");
        s1.display();
        s2.display();
        s3.display();
    }
}
