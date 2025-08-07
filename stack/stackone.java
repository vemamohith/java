package stack;

import java.util.Scanner;

public class stackone {

    public static int insert(int value, int top, int[] stack){
        if(stack.length-1 > top) {
        top++;
        stack[top] = value;
        return top;
        } else {
            System.out.println("push not possible");
        }
        return top;
    }

    public static int delete(int top, int[] stack) {
        stack[top] = 0;
        top--;
        return top;
    }

    public static void display(int top, int[] stack) {
        for (int i = 0; i<=top; i++) {
            System.out.println(stack[i]  + " ");
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stack = new int[sc.nextInt()];
        int top = -1;
        
        top = insert(10, top, stack);
        top = insert(20, top, stack);
        top = insert(30, top, stack);
        display(top, stack);
        top = delete(top, stack);
        top = insert(50, top, stack);
        display(top, stack);
        sc.close();

    }
}
