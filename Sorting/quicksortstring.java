package Sorting;

import java.util.Scanner;

public class quicksortstring{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"Alice","Bob","Charlie","David","Eve"};
        int n = arr.length;
        for(int i = 0 ; i<n-1; i++){
            for(int j = 0; j< (n-i-1); j++){
                if(arr[j].compareTo(arr[j+1]) < 0){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                } 
            }
        }
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
