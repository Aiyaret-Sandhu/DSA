package Practice;
import java.util.Scanner;

public class _4_Prime_test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        System.out.println(isprime(n));
    }

    public static boolean isprime(int num) {
        if (num < 2) return false;
        for (int i = 2 ; i*i < num ; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
