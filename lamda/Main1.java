package lamda;

public class Main1 {
    public static void main(String[] args) {
        // add ref = new add() {
        //     public void addition() {
        //         int a  = 10;
        //         int b = 20;
        //         System.out.println(a+b);
        //     }
        // };
        // ref.addition(); this is normal way of writing the anonymous 
        add ref = (a , b) ->  // lambda function( by using the arrow) // data type is also optional while using the lambda fucntion
            // System.out.println(a+b);
            a+b;
            // no need to mention the return keyword when lambda function has only one line (Return statement)

        int a = ref.addition(10,20);
        System.out.println(a);

    }
}
