package Polymorphism;


class devoloper {
    void work() {
        System.out.println("Working");
    }
    void project() {
        System.out.println("developer is doing project");
    }
}
class javaDeveloper extends devoloper {
    void project () {
        System.out.println("Java developer is doing java project");
    }
}
class pythondeveloper extends devoloper {
    void project() {
        System.out.println("Python developer is doing python project");
    }
}
public class dev {
    public static void main(String[] args) {
        devoloper dev = new devoloper();
        dev = new javaDeveloper();
        dev.work();
        dev.project();
        dev = new pythondeveloper();
        dev.work();
        dev.project();
        
    }
}


