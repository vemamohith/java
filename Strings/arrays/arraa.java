package Strings.arrays;

import java.util.Scanner;

public class arraa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size");
        int [] arr = new int[sc.nextInt()];
        for(int i = 0; i<arr.length; i++) {
            System.out.println("Enter the " + (i+1)+" element");
            arr[i] = sc.nextInt();
        }
        System.out.println("Data elements");
        for(int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("By using for each");
        for(int a: arr) {
            System.out.println(a);
        }
        
    }
}
