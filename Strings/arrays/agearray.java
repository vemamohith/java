package Strings.arrays;

import java.util.Scanner;

public class agearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int[] agearr = new int[sc.nextInt()];
        System.out.println("Enter the age of the students");
        for(int i = 0; i<agearr.length;i++) {
            agearr[i] = sc.nextInt();
        }
        System.out.println("The age of the students are : ");
        // for(int i = 0;i<agearr.length; i++) {
        //     System.out.print(agearr[i] + " ");
        // }
        for(int a : agearr){ // for each loop  // advanced(enhanced )for loop
            System.out.println(a);
        }
        sc.close();
    }
}
