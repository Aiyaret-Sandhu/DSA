package Practice;

import java.util.Scanner;

public class _19_Is_String_Sorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        String[] array = toStringArray(str);
        System.out.println(" The array is sorted ! : -> " + isSorted(array));

    }

    public static String[] toStringArray(String s){
        int n = s.length();
        String[] arr = new String[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = String.valueOf(s.charAt(i));
        return arr;
    }

    public static boolean isSorted(String[] s) {
        for(int i = 1 ; i < s.length ; i++)
            if (s[i-1].compareTo(s[i]) > 0)
                return false;
        return true;
    } 
}
