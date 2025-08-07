package Polymorphism;

class teacher {
    void teach() {
        System.out.println("teaching");
    }
    void takeAttendance() {
        System.out.println("taking attendance");

    }
}
class scienceTeacher extends teacher {
    void teach() {
        System.out.println("teching science");
    }
}
class mathsTeacher extends teacher {
    void teach() {
        System.out.println("teaching maths");
    }
}

public class poly2 {
    public static void main(String[] args) {
        mathsTeacher mt = new mathsTeacher();
        doActivity(mt);
        scienceTeacher st = new scienceTeacher();
        doActivity(st);
        teacher te = new teacher();
        doActivity(te);
    }
    static void doActivity(teacher ref) {
        ref.teach();
        ref.takeAttendance();
    }
}