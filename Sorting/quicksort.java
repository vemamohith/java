package Sorting;

import java.util.Scanner;

public class quicksort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,5,6,1,3};
        int n = arr.length;
        for(int i = 0 ; i<n-1; i++){
            for(int j = 0; j< (n-i-1); j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
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
