package Practice;

import edu.princeton.cs.algs4.StdIn;

public class _27_FixedCapacityGenericStackh<Item> {
    private Item[] a;
    private int N;

    public _27_FixedCapacityGenericStackh(int capacity) {
        this.a = (Item[]) new Object[capacity];
        this.N = 0;
    }

    public void push(Item item) { this.a[N++] = item ; }

    public Item pop() { return this.a[--N]; }

    public boolean isEmpty() { return N == 0 ; }

    public int size() { return N; }

    public static void main(String[] args) {
        _27_FixedCapacityGenericStackh<Double> st = new _27_FixedCapacityGenericStackh<Double>(100);
        while(!StdIn.isEmpty()) {
            Double item = StdIn.readDouble();
            if (item > 0.0) { st.push(item);}
            else if (!st.isEmpty()) {System.out.print(st.pop() + " ");}
        }
        System.out.println("(" + st.size() + " left on stack)");
    }
}
