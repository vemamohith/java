package Strings.arrays;

import java.util.Scanner;

public class twodsum {
    public static void main(String[] args) {
        

    Scanner sc =new Scanner(System.in);
    int[][] arr = new  int[sc.nextInt()][sc.nextInt()];
    for(int i = 0; i<arr.length; i++) {
        for(int j = 0; j<arr[i].length; j++) {
            arr[i][j] = sc.nextInt();
        }
    }
    int sum = 0;
    for(int i = 0; i<arr.length; i++) {
        for(int j = 0; j<arr[i].length; j++) {
            sum = arr[i][j] + sum;
        }
    }
    System.out.println(sum);
}
}
