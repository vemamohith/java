import java.util.Scanner;

public class Scan {
    

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Taking a string input
    System.out.print("Enter a string: ");
    String str = scanner.nextLine();
    System.out.println("You entered: " + str);

    // Taking an integer input
    System.out.print("Enter an integer: ");
    int integer = scanner.nextInt();
    System.out.println("You entered: " + integer);

    // Taking a double input
    System.out.print("Enter a double: ");
    double dbl = scanner.nextDouble();
    System.out.println("You entered: " + dbl);

    // Taking a boolean input
    System.out.print("Enter a boolean: ");
    boolean bool = scanner.nextBoolean();
    System.out.println("You entered: " + bool);

    // Taking a single word input
    System.out.print("Enter a single word: ");
    String word = scanner.next();
    System.out.println("You entered: " + word);

    scanner.close();
}
}