import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        String revString = "";
        for(int i = word.length() - 1; i >= 0; i--) {
            revString += word.charAt(i);
        }
        if(word.equals(revString)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        System.out.println(revString);
        s.close();
    } 
}
