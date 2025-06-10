package Strings.arrays;

import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];
        for(int i = 0; i<3;i++) {
            System.out.println("Enter the values of the " + (i+1) + " class");
            for(int j = 0; j<4;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<3;i++) {
            System.out.println("\nThe values of the " + i+1 + " are:" );
            for(int j = 0; j<4;j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        sc.close();
    }
    
}
