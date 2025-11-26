<<<<<<< HEAD

import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
        int mid = (low + high)/2;
        if(key == arr[mid]) {
            System.out.println("Element found at "+mid);
            return;
        } else if (key < arr[mid]){
            if(arr[low] == key) {
                System.out.println("Element found at " + low);
                return;
            }
            high = mid-1;
        } else {
            if(arr[high] == key) {
                System.out.println("Element found at " + high);
                return;
            }
            low = mid+1;
        }
    }
    System.out.println("Not Found");
}
}
=======
package BinarySearch;

import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
        int mid = (low + high)/2;
        if(key == arr[mid]) {
            System.out.println("Element found at "+mid);
            return;
        } else if (key < arr[mid]){
            if(arr[low] == key) {
                System.out.println("Element found at " + low);
                return;
            }
            high = mid-1;
        } else {
            if(arr[high] == key) {
                System.out.println("Element found at " + high);
                return;
            }
            low = mid+1;
        }
    }
    System.out.println("Not Found");
}
}
>>>>>>> 4ecfcb4dd95708059f7b96dba0304ec457a84060
