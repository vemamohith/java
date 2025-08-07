package arrays;

import java.util.Scanner;
public class arrayinputtypediff {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        str = str.replace("[","");
        str = str.replace("]","");
        str = str.replace(",", "");

        str2 = str2.replace("[","");
        str2 = str2.replace("]","");
        str2 = str2.replace("," ,"");
        // write your code here
        String[] arr = str.split(" ");

        int[] intarr = new int[arr.length];

        for(int i = 0; i<intarr.length; i++) {
            intarr[i] = Integer.parseInt(arr[i]);
        }
        String[] arr2 = str2.split(" ");

        int[] intarr2 = new int[arr2.length];

        for(int i = 0; i<intarr2.length; i++) {
            intarr2[i] = Integer.parseInt(arr2[i]);
        }
        int[] newarr = new int[arr.length];
        

        for(int i  = 0; i<newarr.length; i++) {
            newarr[i] = intarr[i] + intarr2[i];
        }

        for(int i = 0 ; i<newarr.length-1; i++){
            for(int j = 0; j< (newarr.length-i-1); j++){
                if(newarr[j] > newarr[j+1]){
                    int temp = newarr[j];
                    newarr[j] = newarr[j+1];
                    newarr[j+1]= temp;
                } 
            }
        }

        System.out.print("[");
        for(int i = 0; i<newarr.length; i++) {
            System.out.print(newarr[i]);
            if(i!= newarr.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
        
    }
}
