public class person {
    private int id;
    private String name;
    private int age;
    private double height;
    private String email;

    person(int a , String b, int c, double d, String e) {
        id = a;
        name = b;
        age = c;
        height = d;
        email = e;
    }

    void displayinfo() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
        System.out.println(email);
    }
}
