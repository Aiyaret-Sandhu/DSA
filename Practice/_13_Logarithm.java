package Practice;

public class _13_Logarithm {
    public static void main(String[] args) {
        System.out.println(lg(100));
    }

    public static int lg(int n) {
        int count = 0;

        while (n > 1) {
            n >>= 1;
            count++;
        }

        return count;
        
    }
}
