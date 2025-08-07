package Sorting;
public class inssertion {
    public static void main(String[] args) {
        int[] arr = {10,30,20,50,40,05,90,60,80,70};

        for(int i = 1; i<arr.length; i++) {
            int j = i-1; 
            int temp = arr[i];
            while(j>=0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        StringBuffer arr = new StringBuffer(sc)
        for(int i = 0; i<arr.length; i++){
        System.out.println(arr[i]);
        }
    }
    
}
