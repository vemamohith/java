package abstraction;

import java.util.Scanner;

abstract class shape {
    double area;
    abstract void takeInput(Scanner sc);
    abstract void calarea();
    abstract void displayArea();
    
}

class circle extends shape {
    double radius;

    @Override
    void takeInput(Scanner sc) {
        this.radius = sc.nextDouble();
    }

    @Override
    void calarea() {
        area = Math.PI * radius * radius;
    }

    void displayArea() {
        System.out.println(area);
    }
}

class rec extends shape{
    double length;
    double width;

    @Override
    void takeInput(Scanner sc) {
        this.length = sc.nextDouble();
        this.width = sc.nextDouble();
    }

    @Override
    void calarea() {
        area = length * width;
    }

    void displayArea() {
        System.out.println(area);
    }
    
}

class square extends shape
{
    double side;

    @Override
    void takeInput(Scanner sc) {
        this.side = sc.nextDouble();
    }

    @Override
    void calarea() {
        area = side * side;
    }

    void displayArea() {
        System.out.println(area);
    }
    
}


public class Main {
    public static void main(String[] args) {
        shape s;
        Scanner sc = new Scanner(System.in);

        s = new circle();
        s.takeInput();
        s.calarea();
        s.displayArea();

        s = new rec();
        s.takeInput();
        s.calarea();
        s.displayArea();

        s = new square();
        s.takeInput();
        s.calarea();
        s.displayArea();


    }
}
