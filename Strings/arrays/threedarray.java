<<<<<<< HEAD
package Strings.arrays;

import java.util.Scanner;

public class threedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of layers");
        String[][][] strarr = new String[sc.nextInt()][][];
        for(int i = 0; i< strarr.length; i++) {
            System.out.println("Enter the number of class");
            strarr[i] = new String[sc.nextInt()][];
        }
        for(int i = 0; i<strarr.length; i++) {
            for(int j =0; j<strarr[i].length; j++) {
                System.out.println("Enter the number of students in each class ");
                strarr[i][j] = new String[sc.nextInt()];
            }
        }
        for(int i = 0; i<strarr.length; i++) {
            for(int j =0; j<strarr[i].length; j++) {
                for(int k = 0; k<strarr[i][j].length; k++){
                    System.out.println("Enter the marks of the " + (i+1) + "th School " + (j+1) +"th class " + (i+1) +"th student");
                    strarr[i][j][k] = sc.next();
                }
            }
        }

        for(int i = 0; i<strarr.length; i++) {
            for(int j =0; j<strarr[i].length; j++) {
                for(int k = 0; k<strarr[i][j].length; k++){
                    System.out.println(strarr[i][j][k]);
                }
            }
        }
        sc.close();
    }
}
=======
package Strings.arrays;

import java.util.Scanner;

public class threedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of layers");
        String[][][] strarr = new String[sc.nextInt()][][];
        for(int i = 0; i< strarr.length; i++) {
            System.out.println("Enter the number of class");
            strarr[i] = new String[sc.nextInt()][];
        }
        for(int i = 0; i<strarr.length; i++) {
            for(int j =0; j<strarr[i].length; j++) {
                System.out.println("Enter the number of students in each class ");
                strarr[i][j] = new String[sc.nextInt()];
            }
        }
        for(int i = 0; i<strarr.length; i++) {
            for(int j =0; j<strarr[i].length; j++) {
                for(int k = 0; k<strarr[i][j].length; k++){
                    System.out.println("Enter the marks of the " + (i+1) + "th School " + (j+1) +"th class " + (i+1) +"th student");
                    strarr[i][j][k] = sc.next();
                }
            }
        }

        for(int i = 0; i<strarr.length; i++) {
            for(int j =0; j<strarr[i].length; j++) {
                for(int k = 0; k<strarr[i][j].length; k++){
                    System.out.println(strarr[i][j][k]);
                }
            }
        }
        sc.close();
    }
}
>>>>>>> 4ecfcb4dd95708059f7b96dba0304ec457a84060
