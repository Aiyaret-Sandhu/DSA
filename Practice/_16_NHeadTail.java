package Practice;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class _16_NHeadTail {
    public static void main(String[] args) {
        System.out.print("Number of Flips: ");
        int n = StdIn.readInt();
        
        _16_Counter heads = new _16_Counter("heads");
        _16_Counter tails = new _16_Counter("tails");

        for(int i = 0 ; i < n ; i++)
            if (StdRandom.bernoulli(0.5))
                heads.increment();
            else
                tails.increment();
        
        System.out.println(heads);
        System.out.println(tails);

        // int d = heads.tally() - tails.tally();
        // System.out.println("delta: " + Math.abs(d));

        if (heads.tally() == tails.tally()) System.out.println("Tie");
        else System.out.println(max(heads,tails) + " wins!");
    }

    public static _16_Counter max(_16_Counter x, _16_Counter y) {
        if (x.tally() > y.tally()) return x; else return y;
    }
}
