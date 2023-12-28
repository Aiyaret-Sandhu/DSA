package Practice;

public class _18_Palindromes {
    public static void main(String[] args) {
        System.out.println(isPalindrome("amana"));
        System.out.println(isPalindrome("mam"));
    }

    public static boolean isPalindrome(String s){
        int n = s.length();
        for(int i = 0 ; i<n/2 ; i++) 
            if (s.charAt(i)!= s.charAt(n-i-1))
                return false;
        return true;
    }
}
