package Strings;

import java.util.Scanner;

public class revstringwords {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = "Welcome to KodNest";
        String revStr = "";
        String[] strarr = str.split(" ");
        for(int i = 0; i<strarr.length; i++) {
            String revword = "";
            for(int j = 0; j<strarr[i].length(); j++) {
                revword = strarr[i].charAt(j) + revword;
            }
            revStr = revStr + revword;
            if(i!= strarr.length-1){
                revStr = revStr + " ";
            }
        }
        System.out.println(revStr);
        

    }
}
