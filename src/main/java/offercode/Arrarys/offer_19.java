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

        //超时
        /*if (matrix.length==0) return null;
        ArrayList<Integer> result = new ArrayList<>();
        int cols = matrix[0].length;
        int rows = matrix.length;
        int col = cols; //列数
        int row = rows; //行数
        //System.out.println(cols*rows);
        int index = 1;
        flag :
        while (true) {
            for (int i=cols-col; i<col; i++) {
                if (index>cols*rows) break flag;
                result.add(matrix[rows-row][i]);
                index++;
            }
            for (int j=rows-row+1; j<row; j++) {
                if (index>cols*rows) break flag;
                result.add(matrix[j][col-1]);
                index++;
            }
            for (int k=col-2; k>=cols-col; k--) {
                if (index>cols*rows) break flag;
                result.add(matrix[row-1][k]);
                index++;
            }
            for (int m=row-2; m>rows-row; m--) {
                if (index>cols*rows) break flag;
                result.add(matrix[m][cols-col]);
                index++;

            }
            col--;
            row--;
            //System.out.println(result.size());
        }
        return result;*/

        if (matrix.length==0) return null;
        ArrayList<Integer> result = new ArrayList<>();
        int rows = matrix.length-1;
        int cols = matrix[0].length-1;
        int row=0, col=0;
        while (true) {
            //向右
            for (int i=col; i<=cols; i++) {
                result.add(matrix[row][i]);
            }
            row++;
            if (row>rows) break;
            //向下
            for (int i=row; i<=rows; i++) {
                result.add(matrix[i][cols]);
            }
            cols--;
            if (col>cols) break;
            //向左
            for (int i=cols; i>=col; i--) {
                result.add(matrix[rows][i]);
            }
            rows--;
            if (row>rows) break;
            //向上
            for (int i=rows; i>=row; i--) {
                result.add(matrix[i][col]);
            }
            col++;
            if (col>cols) break;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] a = {{ 1, 2, 3, 4},
                     { 5, 6, 7, 8},
                     { 9,10,11,12},
                     {13,14,15,16},
                     /*{17,18,19,20},
                     {21,22,23,34}*/};
        int[][] b = {{1},{2},{3},{4},{5}};

        //System.out.println(a.length);
        //System.out.println(a[4][0]);
        System.out.println(printMatrix(b));
    }


}
