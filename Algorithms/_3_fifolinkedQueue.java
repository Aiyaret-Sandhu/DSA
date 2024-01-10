package Algorithms;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdIn;

public class _3_fifolinkedQueue<Item>{
    private Node first;
    private Node last;
    private int N;

    public class Node{
        Item item;
        Node next;
    }

    public boolean isEmpty() { return first == null ;}
    public int size() { return N; }

    public void enqueue(Item item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else oldlast.next = last;
        N++;
    }

    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        if (isEmpty()) last = null;
        N--;
        return item;
    }

    public static void main(String[] args) {
       _3_fifolinkedQueue<String> q = new _3_fifolinkedQueue<>();
        
        while(!StdIn.isEmpty()) {
            String item = StdIn.readLine();
            if (item.equals("arsh")) q.enqueue(item);
            else if (!q.isEmpty()) System.out.println("-> : " + q.dequeue());
        }

        System.out.println("(" + q.size() + " left on queue)");
    }
}
