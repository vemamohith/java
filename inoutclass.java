public class inoutclass {
    int outerA = 10;
    static int outerB = 20;

    class programInner {
        int innerC = 30;
        static int innerD = 40;

        void display() {
            System.out.println(outerA);
            System.out.println(outerB);
            System.out.println(innerC);
            System.out.println(innerD);
        }
    }

    void outerdisplay() {
        System.out.println(outerA);
        System.out.println(outerB);
        System.out.println(new programInner().innerC);
        System.out.println(programInner.innerD);
    }
}
