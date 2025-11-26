<<<<<<< HEAD
import java.util.Scanner;

public class merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int[] arr = new int[sc.nextInt()]; 
       int[] arr1 = new int[sc.nextInt()];
       for(int i = 0; i<arr.length;i++) {
        arr[i] = sc.nextInt();
       }
       for(int i = 0; i<arr1.length;i++) {
        arr1[i] = sc.nextInt();
       }
       int j = 0;
       while(j > arr1.length) {
        arr[arr.length]  = arr1[j];
        j++;
       }
       for(int i = 0; i<arr.length;i++) {
        System.out.println(arr[i]);
       }
}
}
=======
import java.util.Scanner;

public class merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int[] arr = new int[sc.nextInt()]; 
       int[] arr1 = new int[sc.nextInt()];
       for(int i = 0; i<arr.length;i++) {
        arr[i] = sc.nextInt();
       }
       for(int i = 0; i<arr1.length;i++) {
        arr1[i] = sc.nextInt();
       }
       int j = 0;
       while(j > arr1.length) {
        arr[arr.length]  = arr1[j];
        j++;
       }
       for(int i = 0; i<arr.length;i++) {
        System.out.println(arr[i]);
       }
}
}
>>>>>>> 4ecfcb4dd95708059f7b96dba0304ec457a84060
