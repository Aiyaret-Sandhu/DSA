package Practice;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class _26_FixedCapacityOfStack {
    private String[] a;
    private Integer N;

    public _26_FixedCapacityOfStack(int capacity) {
        this.a = new String[capacity];
        this.N = 0;
    }

    public boolean isEmpty() { return N == 0; }

    public int size() { return N; }

    public void push(String item) { a[N++] = item; }

    public String pop() { return a[--N]; }
    public static void main(String[] args) {
        
        _26_FixedCapacityOfStack st = new _26_FixedCapacityOfStack(100);
        while(!StdIn.isEmpty()){
            String item = StdIn.readString();
            if( item.equals("-")) st.push(item);
            else if(!st.isEmpty()) StdOut.print(st.pop() + " ");
        }
        StdOut.println("(" + st.size() + " left on stack)");
    }
}
