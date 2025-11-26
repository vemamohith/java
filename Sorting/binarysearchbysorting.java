package Sorting;

import java.util.Scanner;
import java.util.Arrays;

public class binarysearchbysorting {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int[] arr = {10,20,40,50,30};
        int key = sc.nextInt();
        int flag = 0;
        for(int i = 0; i<arr.length-1;i++){
            if(arr[i] < arr[i+1]){
                flag = 0;
            } else {
                flag = 1;
            }
        }if(flag == 0){
        sortArray(arr);}
        BinarySeach(arr,key);
        sc.close();
    }
    public static void sortArray(int arr[]){
        Arrays.sort(arr);
    }
    static void BinarySeach(int arr[], int key){
        int low = 0;
        int high = arr.length-1;
        while(low <= high) {
            int mid = (low + high) /2;
            if(arr[mid] == key) {
                System.out.println("Key Found");
                return;
            }
            else if(key < arr[mid] ) {
                high = mid -1;
            } 
            else {
                low = mid +1;
            }
        }
        System.out.println("Key element not found");
    }
    
}
