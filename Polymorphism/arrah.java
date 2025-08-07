package Polymorphism;

import java.util.*;
public class arrah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int[] arr = new int[sc.nextInt()]; 
       int[] arr1 = new int[sc.nextInt()];
       int[] arr2 = new int[arr.length + arr1.length];
       for(int i = 0; i<arr.length;i++) {
        arr[i] = sc.nextInt();
       }
       for(int i = 0; i<arr1.length;i++) {
        arr1[i] = sc.nextInt();
       }
       int j = 0;
       for(int i = j; i<arr.length;i++) {
        arr2[j] = arr[i];
        j++;
       }
       for(int i = 0; i < arr1.length; i++) {
        arr2[j] = arr1[i];
        j++;
       }
       for(int i = 0; i < arr2.length;i++) {
       System.out.print(arr2[i] + " "); 
       }
       
    }
}
