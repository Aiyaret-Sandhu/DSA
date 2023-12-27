package Practice;
import java.util.Scanner;

public class _5_Sqrt {
    public static void main(String[] args) {
        // Newtonian method
        Scanner input  = new Scanner(System.in);
        double num = input.nextDouble();
        input.close();

        System.out.println(sqrt(num));
    }

    public static double sqrt(double n) {
        if (n < 0) return Double.NaN;
        double err = 1e-15;
        double t = n;
        // System.out.println(t);
        while (Math.abs(t - n/t) > err*t) {
            // System.out.println("cond: " + (Math.abs(t - n/t)) + " "+ ( err*t));
            t = (n/t + t)/2.0;
            // System.out.println(t);
        }
        return t;
    }
}
