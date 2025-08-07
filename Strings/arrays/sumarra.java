package Strings.arrays;

import java.util.Scanner;

public class sumarra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        int[] arr1 = new int[arr.length];
        int [] arr2 = new int[arr.length];
        //prefix sum using the sum varible in a single loop
        for(int i  = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i<arr.length; i++) {
            sum = arr[i] + sum;
            arr1[i]  = sum;
        }
        //prefix sum by adding each element from the first (correct logic)
        arr2[0] = arr[0];
        for(int i = 1; i < arr.length; i++) {
            arr2[i] = arr2[i-1] + arr[i];
        }


        for(int i = 0; i<arr.length; i++) {
            System.out.println(arr1[i] + " ");
        }
        System.out.println("2nd array");
        for(int i = 0; i<arr.length; i++) {
            System.out.println(arr2[i] + " ");
        }
        sc.close();
    }
}
