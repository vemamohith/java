package arrays;

import java.util.Scanner;

public class jaggedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[sc.nextInt()][];
        for(int i = 0; i < arr.length;i++) {
            System.out.println("Enter the num of cols in " + i+ " th  row ");
            arr[i] = new int[sc.nextInt()];
        }
        for(int i = 0; i<arr.length;i++) {
            for(int j = 0; j<arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
