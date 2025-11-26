<<<<<<< HEAD
import java.util.Scanner;

public class stringmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[sc.nextInt()];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.next();
        }
        String maxString = arr[0];
        for(int i = 0; i<arr.length; i++) {
            if(arr[i].compareTo(maxString) > 0) {
                maxString = arr[i];
            }
        }
        System.out.println(maxString);
        sc.close();
    }
}
=======
import java.util.Scanner;

public class stringmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[sc.nextInt()];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.next();
        }
        String maxString = arr[0];
        for(int i = 0; i<arr.length; i++) {
            if(arr[i].compareTo(maxString) > 0) {
                maxString = arr[i];
            }
        }
        System.out.println(maxString);
        sc.close();
    }
}
>>>>>>> 4ecfcb4dd95708059f7b96dba0304ec457a84060
