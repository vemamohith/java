public class Main {
    public static void main(String[] args) {
        Ical mycal1 = new Mycalculator1();
        mycal1.add();
        mycal1.sub();
        mycal1.multiply();
        mycal1.divide();
        Ical myIcal2 = new Mycalculator2();
        myIcal2.add();
        myIcal2.sub();
        myIcal2.multiply();
        myIcal2.divide();
    }
}
