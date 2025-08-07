package arrays;

import java.util.Scanner;

public class demoarray {

    public static void main(String[] args) { 
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the length");
        int length = sc.nextInt();
        String[] arr = new String[length];
        insertvalues(arr, sc);
        display(arr);  
        selectionSort(arr);
        display(arr); 
        count(arr);  
        countlengtg(arr);
        insertionsort(arr);
        display(arr);
        

    }
    static void insertvalues(String[] arr, Scanner sc) {
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.next();
        } 
        
    }

    static void display(String[] arr) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    static void selectionSort(String[] arr) {
        for(int i = 0; i< arr.length; i++) {
            int minindex = i;
            for(int j = i+1; j<arr.length; j++) {
                if(arr[j].compareTo(arr[minindex]) < 0 ){
                    minindex = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;

        }
    }

    static void insertionsort(String[] arr) {
        for(int i = 0; i<arr.length; i++) {
                int j = i-1; 
                String temp = arr[i];
                while(j>=0 && temp.compareTo(arr[j]) >0 ) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = temp;
            }
        }
    static void count(String [] arr) {
        System.out.println(arr.length);
    }
    static void countlengtg(String[] arr) {
        for(int i = 0; i<arr.length; i++){
            String word = arr[i];
            System.out.println(word.length());
        }
    }
}
