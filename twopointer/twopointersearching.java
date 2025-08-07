package twopointer;

public class twopointersearching {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int key = 3565;
        boolean flag = true;
        for(int i = 0; i<arr.length; i++) {
            for(int j = arr.length-1; j>i; j--) {
                if(arr[i]  == key|| arr[j] == key) {
                    System.out.println("key found");
                    return;
                }
                else{
                    flag = false;
                }
            }
        }
        if(!flag) {
            System.out.println("key element not found");
        }
    }
}
