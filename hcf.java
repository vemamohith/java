import java.util.Scanner;

public class hcf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input for the first number

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        // input for the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Factors of " + num1 + ":");
        // calling the fucntion for generating the factors
        printFactors(num1);

        System.out.println("Factors of " + num2 + ":");
        // calling the method for generating the factors
        printFactors(num2);
        // finding the hcf by calling the function 
        int hcf = findHCF(num1, num2);
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);

        scanner.close();
    }
    //method for finding the factors
    public static void printFactors(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    // Method to find the HCF (Highest Common Factor) of two numbers
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
