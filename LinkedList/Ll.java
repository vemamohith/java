package LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Ll {
    public static void main(String[] args) {
        // LinkedList ll = new LinkedList();
        // ll.addFirst(0);
        // ll.add(10);
        // ll.add(20);
        // ll.add(30);
        // ll.add(40);\
        
        // ll.addLast(50);

        // for(Object a : ll) {
        //     System.out.println(a + " ");
        // }
        // System.out.println(ll.peek());
        // System.out.println(ll.peekLast());
        // System.out.println(ll.poll());
        // System.out.println();

        LinkedList stack = new LinkedList();

        stack.addFirst(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.addLast(50);
        stack.push(200);

        for(int i = stack.size()-1; i>=0; i--) {
            System.out.println(stack.get(i));
        }
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(100);
        ll.add(200);
        ll.add(300);
        ArrayList al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.
        
        // ll.add("lkdj");

        System.out.println(ll);
        };
    }
