package Practice;

// import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StaticSETofInts;
import edu.princeton.cs.algs4.StdIn;

public class _20_setofInts {
    public static void main(String[] args) {
        int[] arr  = In.readInts("nums.txt");
        StaticSETofInts set = new StaticSETofInts(arr);

        while(!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (set.rank(key) == -1)
                System.out.println(key);
        }
    }
}
