package Practice;

import java.util.Arrays;

public class _2_Matrix_Multiplication {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3, 4},
            {1, 2, 3, 4},
            {1, 2, 3, 4},
            {1, 2, 3, 4}
        };

        int[][] b = {
            {5, 6, 7, 8},
            {5, 6, 7, 8},
            {5, 6, 7, 8},
            {5, 6, 7, 8}
        };

        int n = a.length;

        int[][] c = new int[n][n];

        for(int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++) {
                for(int k = 0 ; k < n ; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        for(int[] row : c) {
            System.out.println(Arrays.toString(row));
        }
    }
}
