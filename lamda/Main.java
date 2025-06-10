package lamda;

public class Main implements add{
    @Override
    public void addition() {
        int a = 10;
        int b = 20;
        System.out.println("addition method from add interface  " + (a+b));
    }
    public static void main(String[] args) {
        add m = new Main();
        m.addition();
    }
}
