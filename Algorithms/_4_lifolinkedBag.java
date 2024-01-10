package Algorithms;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class _4_lifolinkedBag<Item> implements Iterable<Item> {

    private Node first;

    private class Node {
        Item item;
        Node next;
    }

    public void add(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    public int length() {
        int len = 0;
        for (Node x = first; x != null; x = x.next) {
            len++;
        }
        return len;
    }

    public class ListIterator implements Iterator<Item> {
        private Node current = first;

        public boolean hasNext() {return current != null;}

        public void remove() {}

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        } 
    }

    public static void main(String[] args) {
        _4_lifolinkedBag<String> lis = new _4_lifolinkedBag<>();
        while(!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if(item.equals("arsh")) lis.add(item);
        }
        
        Iterator iter = lis.iterator();
        System.out.println();

        System.out.println("There are " +  lis.length() + " items in the bag!");
        while(iter.hasNext()) {
            StdOut.println(iter.next());
        }
    }
}
