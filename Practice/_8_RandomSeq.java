package Practice;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;

public class _8_RandomSeq {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double lo = Integer.parseInt(args[1]);
        double hi = Integer.parseInt(args[2]);
        for (int i = 0 ; i < N ; i++) {
            double x = StdRandom.uniform(lo, hi);
            StdOut.printf("%.2f\n",x);
        }
    }
}
