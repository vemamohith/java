package returntypeprob;

public class withoutreturn {
        public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        display(arr);
        changevalue(arr);
        display(arr);
    }
         static void display(int[] arr) {
                for(int x : arr) {
                    System.out.print(x + " ");
                }
                System.out.println();	    }
            
            static void changevalue(int[] arr) {
                arr[2] = 99;
        }
    }
