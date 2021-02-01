package Task;

import java.util.*;
import java.util.Stack;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("STACK SIMULATION");
        System.out.print("Input your stack size : ");
        int size = input.nextInt();

        myStack stack = new myStack(size);
        short decision;

        do {
            System.out.println("\nYour Stack : " + Arrays.toString(stack.getElement()) + "\n");
            menu();
            System.out.print("Your choice : ");
            decision = input.nextShort();

            if ( decision == 1 ) {
                System.out.println("Input your data : ");
                String data = input.next();
                stack.push(data);
            } else if ( decision == 2 ) {
                stack.pop();
            }

        } while ( decision == 1 || decision == 2);
    }

    private static void menu() {
        System.out.println("STACK MENU");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Exit");
    }
}

class myStack {
    private int size;
    private int top;
    private Object[] element;

    public myStack() {
        this.size = 5;
        this.element = new Object[this.size];
        this.top = 0;
    }

    public myStack(int sz) {
        this.size = sz;
        this.element = new Object[sz];
        this.top = 0;
    }

    public int getSize() {
        return size;
    }

    public int getTop() {
        return top;
    }

    public Object[] getElement() {
        return element;
    }

    public void push(Object data) {
        if ( this.top == this.size ) {
            System.out.println("Stack Full !");
        } else {
            this.element[this.top] = data;
            this.top+=1;
        }
    }

    public Object pop() {
        if ( this.top == 0 && this.element[this.top] == null ) {
            try {
                Stack bait = new Stack();
                bait.pop();
            } catch ( EmptyStackException err ) {
                System.out.println( err + " : Stack empty !");
            }
        }
        else {
            Object temp;

            this.top-=1;
            temp = this.element[this.top];
            this.element[this.top] = null;

            System.out.println("Your data : " + temp + " gone !");
        }
        return 1;
    }
}