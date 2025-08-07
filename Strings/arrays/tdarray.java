package Strings.arrays;

import java.util.Scanner;

public class tdarray {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[][] arr = new int[sc.nextInt()][sc.nextInt()];
      for(int i = 0; i<arr.length; i++){
        for(int j = 0; j<arr[i].length; j++) {
            System.out.println("Enter the " + i + " th element " + j +" th");
            arr[i][j] = sc.nextInt();
        }
      } 
      for(int i = 0; i<arr.length; i++){
        for(int j = 0; j<arr[i].length; j++) {
            System.out.println("the " + i + " th element " + j +" th");
            System.out.println(arr[i][j]);
        }
      } 
    }
}
