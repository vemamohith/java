package Strings.arrays;

import java.util.Scanner;

public class sumofelements {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    //creating an array
    int[][] arr = new int[sc.nextInt()][sc.nextInt()];
    // setting up the array values into array 
    for(int i = 0; i<arr.length; i++){
        for(int j = 0; j<arr[i].length; j++){
            arr[i][j] = sc.nextInt();
        }
    }
    // finding the min values 
    for(int i = 0; i<arr.length; i++){
        int sum = 0;
        for(int j = 0; j<arr[i].length; j++){
            sum += arr[i][j];
        }
        // printing the min values of the each row 
        System.out.println("sum of "+(i+1) + " is "+sum);
    }
    sc.close();
}
}
