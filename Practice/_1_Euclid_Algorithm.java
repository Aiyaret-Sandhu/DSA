package Practice;

public class _1_Euclid_Algorithm {
    public static void main(String[] args) {
        System.out.println(gcd(12,3));
    }

    public static int gcd(int p , int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q,r);
    }
}