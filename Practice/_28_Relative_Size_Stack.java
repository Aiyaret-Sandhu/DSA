package Practice;

import edu.princeton.cs.algs4.StdIn;

public class _28_Relative_Size_Stack<Item> {
    private Item[] a;
    private int N;

    public _28_Relative_Size_Stack(int cap) {
        this.a = (Item[]) new Object[cap];
        this.N = 0;
    }

    public boolean isEmpty() { return this.N == 0; }

    public int size() { return this.N; }

    public void resize(int max){
        Item[] temp = (Item[]) new Object[max];
        for(int i = 0 ; i < N ; i++ ) 
            temp[i] = this.a[i];
        a = temp;
    }

    public void push(Item item) {
        if (this.N == this.a.length) resize(2*this.a.length);
        a[N++] = item; 
    }

    public Item pop() { 
        Item item = a[--N];
        a[N] = null;
        if(this.N > 0 && this.N == this.a.length) resize(this.a.length/2);
        return item;
    }

    public static void main(String[] args) {
        _28_Relative_Size_Stack<Double> st = new _28_Relative_Size_Stack<Double>(5);
        while(!StdIn.isEmpty()) {
            Double item = StdIn.readDouble();
            if (item > 0.0) { st.push(item); }
            else if (!st.isEmpty()) { System.out.print(st.pop() + " "); }
        }
        System.out.println("(" + st.size() + " left on stack)");
    }

}
