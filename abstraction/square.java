<<<<<<< HEAD
package abstraction;

public class square extends shape   {
    double side;

    @Override
    void takeInput() {
        this.side = 1.0;
    }

    @Override
    void calarea() {
        area = side * side;
    }

    void displayArea() {
        System.out.println(area);
    }
    
}
=======
package abstraction;

public class square extends shape   {
    double side;

    @Override
    void takeInput() {
        this.side = 1.0;
    }

    @Override
    void calarea() {
        area = side * side;
    }

    void displayArea() {
        System.out.println(area);
    }
    
}
>>>>>>> 4ecfcb4dd95708059f7b96dba0304ec457a84060
