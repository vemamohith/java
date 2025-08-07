package Strings;

public class strings {
    public static void main(String[] args) {
        String s1 = "KodNest";
        String s2 = new String("KodNest");
        char[] arr = {'k','o','d','N','e','s','t'};

        String s3 = new String(arr);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        StringBuffer s4 = new StringBuffer("KodNest");
        StringBuilder s5 = new StringBuilder("KodNest");

        System.out.println(s4);
        System.out.println(s5);
    }
    
}
