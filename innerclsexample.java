public class innerclsexample {
    public static void main(String[] args) {
        inoutclass inout = new inoutclass();
        inout.outerdisplay();
        inoutclass.programInner proin = inout.new programInner();
        proin.display();  
    }
}
