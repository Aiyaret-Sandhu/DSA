package Practice;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

public class _25_Dijkstra_TwoStack_Arithmetic {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();

        while(!StdIn.isEmpty()){
            String s = StdIn.readString();

            if      (s.equals("(")) {}
            else if (s.equals("+")) ops.push(s);
            else if (s.equals("-")) ops.push(s);
            else if (s.equals("*")) ops.push(s);
            else if (s.equals("/")) ops.push(s);
            // else if (s.equals("sqrt")) ops.push(s);
            else if (s.equals(")")) 
            {
                String op = ops.pop();
                double v = vals.pop();
                if      (op.equals("+")) v += vals.pop();
                else if (op.equals("-")) v -= vals.pop();
                else if (op.equals("*")) v *= vals.pop();
                else if (op.equals("/")) v /= vals.pop();
                // else if (op.equals("sqrt")) v = Math.sqrt(v);
                vals.push(v);
            }
            else vals.push(Double.parseDouble(s));
        }

        System.out.println(vals.pop());
    }
}
