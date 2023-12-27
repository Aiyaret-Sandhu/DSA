package Practice;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;

public class _7_StdRandom {
    public static void main(String[] args) {
        // int a = (int)(StdRandom.random()*14);

        System.out.println(uniform(3,89.566));
        System.out.println(uniform(45));
        System.out.println(uniform(3,9));
        int[] a = {1, 3, 54, 6};
        shuffle(a);
        System.out.println(Arrays.toString(a));
        StdOut.println("Hello world");
    }

    public static double uniform(double a , double b) {
        return (a + StdRandom.random()*(b-a));
    }

    public static int uniform(int a) {
        return (int) (StdRandom.random()*a);
    }

    public static int uniform(int a, int b) {
        return (int) (a + uniform(b-a));
    }

    public static void shuffle(int[] ar) {
        int N = ar.length;
        for(int i = 0 ; i < N ; i++)
        {
            int r = i + StdRandom.uniform(N-i);
            int temp = ar[i];
            ar[i] = ar[r];
            ar[r] = temp;
        }
    }
}
