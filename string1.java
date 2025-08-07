
import java.util.Arrays;

public class string1 {
    public static void main(String[] args) {
        // String name = "Mohith";
        // String name1 = "Mohith";
        // if(name == name1) {
        //     System.out.println("equal");
        // } 
        // else {
        //     System.out.println("not equal");
        // }
        // String name2 = new String("Mohith");
        // String name3 = new String("mohith");
        // if(name3 == name2) {
        //     System.out.println("equal");
        // } 
        // else {
        //     System.out.println("not equal");
        // }
        // if(name.equalsIgnoreCase(name3)) {
        //     System.out.println("equal");
        // } 
        // else {
        //     System.out.println("not equal");
        // }
        // if(name.equals(name1)) {
        //     System.out.println("equal");
        // } 
        // else {
        //     System.out.println("not equal");
        // }
        // System.out.println(name);
        // System.out.println(name.charAt(5));
        // System.out.println(name.toLowerCase());
        // System.out.println(name.toUpperCase());
        // System.out.println(name.startsWith("moh"));
        // System.out.println(name.endsWith("th"));
        // System.out.println(name.indexOf("M"));
        // System.out.println(name.lastIndexOf("t"));
        // System.out.println(name.substring(0, 4));
        // System.out.println(name.substring(4));
        // String str1 = "    Moh";
        // System.out.println(str1.trim());
        // System.out.println(str1.replace("o", "t"));
        // String friuts = "Apple,banana,grapes";
        // String[] data =  friuts.split(",");
        // System.out.println(data);
        // System.out.println(friuts.split(","));
        // char[] arr = friuts.toCharArray();
        // System.out.println(arr);
        // System.out.println(name.equals("demo"));
        // System.out.println(name+"mohi");
        // name = name + "moh";
        // System.out.println(name);

        // String s = "mohith";
        // String s1 = "mohith0";
        // if(s(1).equals(s1(1))) {
        //     System.out.println("equal");
        // }

        String nam = "anup";
        String demo = "ANUP";
        System.out.println(nam.compareTo(demo));

        String str = "1000 2000 3300";
        String[] strArr = str.split(" ");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        System.out.println(Arrays.toString(intArr));
    }
      
}


