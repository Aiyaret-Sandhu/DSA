package Practice;

import java.util.Stack;

import edu.princeton.cs.algs4.StdIn;

public class _31_tobinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter the number : ");
        int N = StdIn.readInt();

        while (N > 0) {
            stack.push(N % 2);
            N /= 2;
        }

        System.out.print("The Binary representation is : ");

        while(!(stack.isEmpty())) {
            System.out.print(stack.pop());
        }
        System.out.println();

    }
}
