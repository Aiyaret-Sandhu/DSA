package Practice;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import java.util.Iterator;

public class _29_Iteration{
    public static void main(String[] args) {
        Stack<String> s = new Stack<String>();
        for(int i = 0 ; i < 5 ; i++) {
            String abc = StdIn.readLine();
            s.push(abc);
        }

        Iterator<String> i = s.iterator();
        while (i.hasNext()) {
            String cd = i.next();
            System.out.print(cd + " ");
        }
    }
}