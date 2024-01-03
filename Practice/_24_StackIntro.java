package Practice;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

public class _24_StackIntro {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        while(!StdIn.isEmpty()){
            stack.push(StdIn.readInt());
        }

        // Ctrl + Z -> Enter
        
        for(int i : stack){
            System.out.println(i);
        }
    }
}
