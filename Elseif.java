import java.util.Scanner;
public class Elseif {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       if (num == 1){
        System.out.println("one");
       } else if (num == 2){
        System.out.println("two");
       } else if (num ==3) {
        System.out.println("three");
       } else if (num == 4) {
        System.out.println("four");
       } else  if (num == 5) {
        System.out.println("five");
       }
       else {
        System.out.println("invalid number");
       }
       sc.close();
    }
    
    
}
