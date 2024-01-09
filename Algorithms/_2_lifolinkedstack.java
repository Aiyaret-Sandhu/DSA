package Algorithms;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class _2_lifolinkedstack<Item> 
{
    private Node first;
    private int N;

    private class Node 
    {
        Item item;
        Node next;
    }

    public boolean isEmpty() { return first == null; }

    public int size() { return N; }

    public void push(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        this.N++;
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    public static void main(String[] args) {
        Stack<String> s = new Stack<String>();
        while (!StdIn.isEmpty())
        {
        String item = StdIn.readString();
        if (!item.equals("-"))
        s.push(item);
        else if (!s.isEmpty()) StdOut.print(s.pop() + " ");
        }
        
        StdOut.println("(" + s.size() + " left on stack)");
    }

}
