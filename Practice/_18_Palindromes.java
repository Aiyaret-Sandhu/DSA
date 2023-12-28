package Practice;

import java.util.Arrays;

public class _18_Palindromes {
    public static void main(String[] args) {
        System.out.println(isPalindrome("amana"));
        System.out.println(isPalindrome("mam"));

        System.out.println();
        
        fileNameExtension("hello.java");
    }

    public static boolean isPalindrome(String s){
        int n = s.length();
        for(int i = 0 ; i<n/2 ; i++) 
            if (s.charAt(i)!= s.charAt(n-i-1))
                return false;
        return true;
    }

    public static void fileNameExtension(String file) {
        int idx = file.lastIndexOf(".");
        String name = file.substring(0, idx);
        String extension = file.substring(idx+1, file.length());
        
        String[] arr = {name, extension};
        System.out.println(Arrays.toString(arr));

        System.out.println("file name : " + arr[0]);
        System.out.println("file extension : " + arr[1]);
    }
}
