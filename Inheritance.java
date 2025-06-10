public class Inheritance {
    public static void walk() {
        System.out.println("walking");
    }
    public static void  charging() {
        System.out.println("charging");
    }
    public static void speak() {
        System.out.println("speaking");
    }
}

class teacherrobot extends Inheritance {
    public static void  teaching() {
        System.out.println("teaching");
    }
}
class doctorrobot extends Inheritance {
    public static void surgery() {
        System.out.println("doing surgery");
    }
}

