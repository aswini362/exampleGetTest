package DSA.Arrays;

import java.util.Arrays;

public class LeetCode73SetMatrixZeroes {

    public static void main(String[] args) {

    }

    public static void setMatrixZero(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] copy = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.arraycopy(matrix[i], 0, copy[i], 0, n);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    for (int c = 0; c < n; c++) {
                        copy[i][c] = 0;
                    }
                    for (int r = 0; r < m; r++) {
                        copy[r][j] = 0;
                    }
                }

            }

        }
        for (int i = 0; i < m; i++) {
            System.arraycopy(copy[i], 0, matrix[i], 0, n);
        }
    }

    public static void setMatrixZeroBetter(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }

            }

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }

        }

    }


    public static void setMatrixZeroOptimal(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean firstRowZeros = false;
        boolean firstColZeros = false;

        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColZeros = true;
                break;
            }
        }
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowZeros = true;
                break;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }

        }

        if(firstColZeros){
            for (int i=0;i<m;i++){
                matrix[i][0] = 0;
            }
        }
        if(firstRowZeros){
            for(int j=0;j<n;j++){
                matrix[0][j]=0;
            }
        }

    }
}
