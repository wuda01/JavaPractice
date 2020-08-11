package offercode.Arrarys;

import java.util.ArrayList;

public class offer_19 {

    /**
     * 顺时针打印矩阵
     * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
     * 例如，如果输入如下4 X 4矩阵：
     *  1  2  3  4
     *  5  6  7  8
     *  9 10 11 12
     * 13 14 15 16
     * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
     */

    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        /*if (matrix.length==0) return null;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i=0; i<matrix.length; i++) {
            if (i%2==0) {
                for (int j=0; j<matrix[i].length; j++) {
                    result.add(matrix[i][j]);
                }
            } else {
                for (int j=matrix[i].length-1; j>=0; j--) {
                    result.add(matrix[i][j]);
                }
            }
        }
        return result;*/

        if (matrix.length==0) return null;
        ArrayList<Integer> result = new ArrayList<>();
        int C = matrix[0].length;
        int R = matrix.length;
        int col = C; //列数
        int row = R; //行数
        //System.out.println(col);
        //System.out.println(row);
        while (result.size()<C*R) {
            for (int i=C-col; i<col; i++) {
                result.add(matrix[R-row][i]);
            }
            for (int j=R-row+1; j<row; j++) {
                result.add(matrix[j][col-1]);
            }
            for (int k=col-2; k>=C-col; k--) {
                result.add(matrix[row-1][k]);
            }
            for (int m=row-2; m>R-row; m--) {
                result.add(matrix[m][C-col]);
            }
            col--;
            row--;
            //System.out.println(result.size());
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] a = {{ 1, 2, 3, 4},
                     { 5, 6, 7, 8},
                     { 9,10,11,12},
                     {13,14,15,16},
                     {17,18,19,20},
                     {21,22,23,34}};

        //System.out.println(a.length);
        //System.out.println(a[4][0]);
        System.out.println(printMatrix(a));
    }


}
