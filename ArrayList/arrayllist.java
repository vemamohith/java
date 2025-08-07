package ArrayList;
import java.util.*;
public class arrayllist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList al = new ArrayList(); 

        al.add(10);
        al.add(20);
        al.add(40);
        al.add("hello");
        
        System.out.println("By using iterator ");
        Iterator itr  = al.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());     
        }
        System.out.println("--------------------------------");
        System.out.println("By using for each loop");
        for(Object a : al) {
            System.out.println(a);
        }
        System.out.println("--------------------------------");
        ListIterator litr = al.listIterator();

        while (litr.hasNext()) {
            System.out.println(litr.next());
            
        }
    }
    
}


