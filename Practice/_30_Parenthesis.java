package Practice;

import edu.princeton.cs.algs4.StdIn;

public class _30_Parenthesis<Item> {
    private Item[] a ;
    private int N;

    public _30_Parenthesis() {
        this.a = (Item[]) new Object[1];
        this.N = 0;
    } 

    public boolean isEmpty() { return this.N == 0; }

    public int size() { return this.N; }

    public void resize(int size) {
        Item[] temp = (Item[]) new Object[size];
        for(int i = 0 ; i < N ; i++) {
            temp[i] = this.a[i];
        }
        this.a = temp;
    }

    public void push(Item item) {
        if (this.N == this.a.length) resize(2*this.a.length);
        this.a[this.N++] = item;
    }

    public Item pop() {
        Item item = this.a[--this.N];
        this.a[this.N] = null;
        if (this.N > 0 && this.N == this.a.length/4) resize(this.a.length/4);
        return item;
    }

    public static void main(String[] args) {
        _30_Parenthesis<Character> par = new _30_Parenthesis<>();
        String s = StdIn.readString();
        char[] arr = s.toCharArray();

        for(char c : arr){
            if (c == '[' || c == '(' || c == '{') par.push(c);
            else if (c == ']' || c == ')' || c == '}') {
                if (par.isEmpty()) break;

                char top = par.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) break;
            }
        }

        System.out.println(par.isEmpty());
    }

}
