package Algorithms;

// ALGORITHM 1.1 Pushdown (LIFO) stack (resizing array implementation)

import java.util.Iterator;

public class _1_lifoStack<Item> implements Iterable<Item> { 

    private Item[] a ;
    private int N;

    public _1_lifoStack() {
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

    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    public class ReverseArrayIterator implements Iterator<Item> {
        private int i = N;
        public boolean hasNext() {return i > 0; }
        public Item next() {return a[--i]; }
        public void remove() {}
    }

}