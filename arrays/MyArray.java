package arrays;

import java.util.Scanner;



public class MyArray {
    private int[] arr;
    private int size;
    private int capacity;

    
    public MyArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }

   
    public void insert(int value) {
        if (size < capacity) {
            arr[size] = value;
            size++;
        } else {
            System.out.println("Array is full. Cannot insert more elements.");
        }
    }

    
    public void delete(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index. Cannot delete.");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        System.out.println("Deleted element at index " + index);
    }

    
    public void display() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void linearSearch(int value) {
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] == value) {
                System.out.println("key element found at " + i);
            }
        }
    }

    public void bubblesort() {
        int n = arr.length;
        for(int i = 0 ; i<n-1; i++){
            for(int j = 0; j< (n-i-1); j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                } 
            }
        }
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyArray myArr = new MyArray(5);  

        myArr.insert(10);
        myArr.insert(2);
        myArr.insert(30);
        myArr.insert(4);
        myArr.display();  

        myArr.delete(2);      
        myArr.display();  

        myArr.delete(10); 

        myArr.linearSearch(2);
        myArr.bubblesort();
        myArr.display();
        scanner.close();
    }
}
