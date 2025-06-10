import java.util.*;
public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n ; i++) {
            int item = sc.nextInt();
            arr[i] = item;
        }
        Arrays.sort(arr);
        for(int i = 0; i<arr.length; i++)  {
            System.out.print(arr[i] + " ");
        }
       
        sc.close();
    }
    
}
