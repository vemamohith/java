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
