package Practice;

import java.util.Arrays;

public class _12_Transpose {
    public static void main(String[] args) {
        int[][] array = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for (int[] ar : array) {
            System.out.println(Arrays.toString(ar));
        }

        System.out.println();

        transpose(array);
    }

    public static void transpose(int[][] arr) {
        int n = arr.length; 
        int m = arr[0].length;
        int[][] newarr = new int[m][n];
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < n ; j++) {
                newarr[i][j] = arr[j][i];
            }
        }
        for(int[] a : newarr) 
            System.out.println(Arrays.toString(a));
    }
}
