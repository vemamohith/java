package Strings;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the array length:");
    //     String[] arr = new String[sc.nextInt()];
    //     System.out.println("Enter the values\n");
    //     for(int i = 0; i<arr.length;i++) {
    //         arr[i] = sc.next();
    //     }
    //     String key = sc.next();
    //     for(int i = 0;i < arr.length;i++) {
    //         if(key.equals(arr[i])) {
    //             System.out.println("Found at the index: " + i);
    //             return;
    //         }
    //     }
    //     System.out.println("Not found");
        System.out.println("Enter the array length:");
        int[] arrint = new int[sc.nextInt()];
        for(int i = 0; i<arrint.length;i++){
            arrint[i] = sc.nextInt();
        }
        System.out.println("Enter the key:");
        int key1 = sc.nextInt();
        for(int i = 0; i < arrint.length; i++) {
            if (key1 == arrint[i]) {
                System.out.println("Found at the index: " + i);
                // System.exit(0); // it is not good pratice to use either we can use return statement 
                return;
            }
        }
        System.out.println("Not found");
    }
} 

