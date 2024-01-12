package Algorithms;

import edu.princeton.cs.algs4.StdIn;

public class _5_insertionsort {
    public static void sort(Comparable[] a){
        int N = a.length;
        for(int i = 0 ; i < N ; i++){
            for(int j = i ; j > 0 ; j--){
                if (less(a[j],a[j-1])) exch(a, j, j-1);
            }
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable[] a) {
        for(int i = 0 ; i < a.length ; i++ ){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a) {
        for(int i = 1 ; i < a.length ; i++) {
            if (less(a[i], a[i-1])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] a = StdIn.readStrings();
        show(a);
        sort(a);
        System.out.println();
        assert isSorted(a);
        show(a);
    }
}
