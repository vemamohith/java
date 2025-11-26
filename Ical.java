<<<<<<< HEAD
interface Ical {
    void add();
    void sub();
    void multiply();
    void divide();
}

class Mycalculator1 implements Ical  {
    int a = 10;
    int b = 20;
    public void add() {
        System.out.println(a+b);
    }
    public void sub() {
        System.out.println(a-b);
    }
    public void multiply() {
        System.out.println(a*b);
    }
    public void divide() {
        System.out.println(a/b);
    }    
}
class Mycalculator2 implements Ical  {
    public void add() {
    }
    public void sub() {
    }
    public void multiply() {
    }
    public void divide() {}

    // Overloaded methods (optional, not required by interface)
    public void add(int a,int b) {
        System.out.println(a+b);
    }
    public void sub(int a,int b) {
        System.out.println(a-b);
    }
    public void multiply(int a,int b) {
        System.out.println(a*b);
    }
    public void divide(int a,int b) {
        System.out.println(a/b);
    }    
}
=======
interface Ical {
    void add();
    void sub();
    void multiply();
    void divide();
}

class Mycalculator1 implements Ical  {
    int a = 10;
    int b = 20;
    public void add() {
        System.out.println(a+b);
    }
    public void sub() {
        System.out.println(a-b);
    }
    public void multiply() {
        System.out.println(a*b);
    }
    public void divide() {
        System.out.println(a/b);
    }    
}
class Mycalculator2 implements Ical  {
    public void add() {
    }
    public void sub() {
    }
    public void multiply() {
    }
    public void divide() {}

    // Overloaded methods (optional, not required by interface)
    public void add(int a,int b) {
        System.out.println(a+b);
    }
    public void sub(int a,int b) {
        System.out.println(a-b);
    }
    public void multiply(int a,int b) {
        System.out.println(a*b);
    }
    public void divide(int a,int b) {
        System.out.println(a/b);
    }    
}
>>>>>>> 4ecfcb4dd95708059f7b96dba0304ec457a84060
