package Strings.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,0,-1,0,-2,2};
        // for(int i = 0; i<arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }
        System.out.println("enter the target");
        int target = sc.nextInt();
        // int i = 0, j = arr.length - 1;
        // while (i < j) {
        //     int sum = arr[i] + arr[j];
        //     if (sum == target) {
        //         System.out.println("found");
        //         break;
        //     } else if (sum < target) {
        //         i++;
        //     } else {
        //         j--;
        //     }
        Arrays.sort(arr);
        for(int i = 0; i<arr.length-3; i++) {
            for(int j = arr.length-1; j>i-2; j--) {
                for(int k = j-1; k>i-1; k--){
                    for(int l = k-1; l>i; l--){
                int sum = arr[i] + arr[j] + arr[k] +arr[l];
                if(sum == target) {
                    System.out.println("found at index " + arr[i]+ " " + arr[l]  + " " + arr[k] + " " + arr[j]);
                }
            }
        }
        }
    }
        sc.close();
    }
}
