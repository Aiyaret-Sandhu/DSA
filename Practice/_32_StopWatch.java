package Practice;

import edu.princeton.cs.algs4.Stopwatch;

public class _32_StopWatch {
    private final long start;

    public _32_StopWatch() {
        this.start = System.currentTimeMillis();
    }

    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now-start);
    }
    public static void main(String[] args) {
        Stopwatch sta = new Stopwatch();
        int ans = factorial(30);
        double time = sta.elapsedTime();
        System.out.println(ans + " took " + time);
    }

    public static int factorial(int a){
        if (a <= 1) return 1;
        return (a * factorial(a-1));
    }
}
