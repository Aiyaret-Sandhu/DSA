package Practice;

import java.util.Scanner;

public class _11_Binary_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        String bin = Integer.toBinaryString(n);
        System.out.println(bin);
        // String s = "";
        // for(int i = n ; i > 0 ; i /= 2) {
        //     s += (n%2);
        // }
        // System.out.println(s);

        boolean[][] array = {
            {true, false, true},
            {false, true, false},
            {true, true, false}
        };


        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
        a[i] = 9 - i; 
        for (int i = 0; i < 10; i++)
        a[i] = a[a[i]]; 
        for (int i = 0; i < 10; i++)
        System.out.println(i);
        
        System.out.print("  ");
        for (int colNum = 0; colNum < array[0].length; colNum++) {
            System.out.print(colNum + " ");
        }
        System.out.println(); // New line after column numbers
        
        for (int rowNum = 0; rowNum < array.length; rowNum++) {
            // Printing row number
            System.out.print(rowNum + " ");
            
            // Printing contents of the array
            for (boolean value : array[rowNum]) {
                if (value) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // New line after each row
        }
    }
}
