public class prat {
    int roll;
    String name;
    double marks;
    
    prat() {}

    prat(int roll) {
        this.roll = roll;
    }
    prat(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
    
    
    prat(int roll,String name, double marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    

    void displayinfo() {
        System.out.println(roll);
        System.out.println(name);
        System.out.println(marks);
    }
    public static void main(String[] args) {
        prat p2 = new prat(); 
        prat p = new prat(101);
        prat p1 = new prat(101, "mohith");
        prat p3 = new prat(101, "mohith", 100);
        p.displayinfo();
        p1.displayinfo();
        p3.displayinfo();
        p2.displayinfo();
    }
}
// 10  30 static block
// main method
// 30 static method 
//40 instance block
// constructor 20
//40 instance method

 