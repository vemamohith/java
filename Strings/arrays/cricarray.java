<<<<<<< HEAD
package Strings.arrays;

import java.util.Scanner;

public class cricarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players in the team");
        String[] cricarr = new String[sc.nextInt()];
        System.out.println("Enter the names of the players ");
        for(int i = 0; i<cricarr.length;i++) {
            cricarr[i] = sc.next();
        }
        System.out.println("The players in the team : ");
        int i = 1;
        for(String name : cricarr) {
            System.out.println("Player "  + i  + " "+  name + " , ");
            i++;
        }
        sc.close();
    }
}
=======
package Strings.arrays;

import java.util.Scanner;

public class cricarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players in the team");
        String[] cricarr = new String[sc.nextInt()];
        System.out.println("Enter the names of the players ");
        for(int i = 0; i<cricarr.length;i++) {
            cricarr[i] = sc.next();
        }
        System.out.println("The players in the team : ");
        int i = 1;
        for(String name : cricarr) {
            System.out.println("Player "  + i  + " "+  name + " , ");
            i++;
        }
        sc.close();
    }
}
>>>>>>> 4ecfcb4dd95708059f7b96dba0304ec457a84060
