package Practice;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdIn;

public class _17_Rolls {
    public static void main(String[] args) {
        StdOut.print("Enter the number of times the die is rolled: ");
        int times = StdIn.readInt();
        StdOut.print("Enter the number of sides of the die: ");
        int sides = StdIn.readInt();
        _16_Counter[] rolls = new _16_Counter[sides + 1];

        for(int i = 1 ; i <= sides ; i++)
            rolls[i] = new _16_Counter(i + " 's");
        
        for(int i = 0; i < times ; i++){
            int result = StdRandom.uniform(1,sides + 1);
            rolls[result].increment();
        }

        for(int i = 1 ; i <= sides ; i++)
            System.out.println(rolls[i]);
    }
}
