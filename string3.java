<<<<<<< HEAD
import java.util.Scanner;

public class string3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Stirng: ");
        String s = sc.nextLine();
        System.out.println("Enter the character that needs to find the count");
        String finds = sc.next();
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == finds.charAt(0)) {
                count += 1;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
=======
import java.util.Scanner;

public class string3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Stirng: ");
        String s = sc.nextLine();
        System.out.println("Enter the character that needs to find the count");
        String finds = sc.next();
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == finds.charAt(0)) {
                count += 1;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
>>>>>>> 4ecfcb4dd95708059f7b96dba0304ec457a84060
