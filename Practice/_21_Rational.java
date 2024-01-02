package Practice;

// import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
// import java.util.Arrays;

public class _21_Rational {
    
    public static void main(String[] args) {
        System.out.print("Enter the numerator : ");
        long a = StdIn.readLong();
        System.out.print("Enter the denominator : ");
        long b = StdIn.readLong();
        Rational r = new Rational(a, b);
        System.out.println();
        System.out.println("The rational number is : "+ r.toString());

        System.out.println("The primal form is : " + r.getPrimal());

        System.out.println("The gcd is : " + r.getGcd());

        System.out.println();
        System.out.println();

        System.out.print("Enter the second numerator : ");
        long c = StdIn.readLong();
        System.out.print("Enter the second denominator : ");
        long d = StdIn.readLong();
        Rational s = new Rational(c, d);

        System.out.println();

        System.out.println("Plus : " + r.plus(s));
        System.out.println("Minus : " + r.minus(s));
        System.out.println("Product : " + r.times(s));
        System.out.println("Division : " + r.divides(s));
        System.out.println("Are they equal : " + r.equals(new Rational(6, 13)));

        
    }
}
