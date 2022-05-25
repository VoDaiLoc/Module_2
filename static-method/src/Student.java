public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    Student(int r, String n) {
        this.rollno = r;
        this.name = n;
    }
    static void change() {
        college = "CODEGYM";
    }
    void display() {
        System.out.printf("%s %s %s \n", rollno, name, college);
    }
}
