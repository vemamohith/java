<<<<<<< HEAD
package agreegation;

class Device {
    public void powerOn() {
        System.out.println("Device is powered on.");
    }
    public void powerOf(){
        System.out.println("power offing");
    }
}
class Smartphone extends Device {
    public void powerOn() {
        System.out.println("Smartphone is powered on with a touch screen interface.");
    }
}

public class demo {
    public static void main(String[] args) {
        Device myDevice = new Smartphone();
        myDevice.powerOn(); 
        myDevice.powerOf();
    }
}
=======
package agreegation;

class Device {
    public void powerOn() {
        System.out.println("Device is powered on.");
    }
    public void powerOf(){
        System.out.println("power offing");
    }
}
class Smartphone extends Device {
    public void powerOn() {
        System.out.println("Smartphone is powered on with a touch screen interface.");
    }
}

public class demo {
    public static void main(String[] args) {
        Device myDevice = new Smartphone();
        myDevice.powerOn(); 
        myDevice.powerOf();
    }
}
>>>>>>> 4ecfcb4dd95708059f7b96dba0304ec457a84060
