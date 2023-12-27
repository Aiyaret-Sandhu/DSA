package Practice;

import java.util.Arrays;

// 1.1.15 Write a static method histogram() that takes an array a[] of int values and 
// an integer M as arguments and returns an array of length M whose ith entry is the number of times the integer i appeared in the argument array. If the values in a[] are all 
// between 0 and M–1, the sum of the values in the returned array should be equal to 
// a.length.
public class _14_histogram {
    public static void main(String[] args) {
        int[] ar = {0,1,1,2,3,3,3,4,4,4,4,4,4};

        int[] ne = histogram(ar,5);

        System.out.println(Arrays.toString(ne));
        System.out.println(exR1(6));

    }

    public static int[] histogram(int[] a , int M) {
        int[] b = new int[M];

        for(int i = 0 ; i < a.length ; i++)
            b[a[i]]++;
        
        return b;
    }

    public static String exR1(int n) 
    {
        if (n <= 0) return "";
        return exR1(n-3) + n + exR1(n-2) + n; 
    }
}
