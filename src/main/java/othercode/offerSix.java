package othercode;

import java.util.ArrayList;

public class offerSix {

    //offer_64
    public ArrayList<Integer> maxInWindows(int [] num, int size){
        ArrayList<Integer> list = new ArrayList<>();
        if (num.length<size || size<1) return list;
        for (int i=0; i<num.length-size+1; i++) {
            int max = num[i];
            for (int j=i+1; j<i+size; j++) {
                max = Math.max(max, num[j]);
            }
            list.add(max);
        }
        return list;
    }

    //offer_65


    //offer_66
    public int count;
    public boolean isValid(int threshold, int rows, int cols) {
        int sum = 0;
        while (rows!=0) {
            sum += rows%10;
            rows = rows/10;
        }
        while (cols!=0) {
            sum += cols%10;
            cols = cols/10;
        }
        if (sum<=threshold) return true;
        else return false;
    }
    public void move(int i, int j, int threshold, int rows, int cols, int[][] flag) {
        if (i<0 || i>=rows || j<0 || j>=cols) return;
        if (flag[i][j]==1) return;
        if (!isValid(threshold, i, j)) {
            flag[i][j] = 1;
            return;
        }
        flag[i][j] = 1;
        count++;
        move(i-1, j, threshold, rows, cols, flag);
        move(i+1, j, threshold, rows, cols, flag);
        move(i, j-1, threshold, rows, cols, flag);
        move(i, j+1, threshold, rows, cols, flag);
    }
    public int movingCount(int threshold, int rows, int cols){
        int[][] flag = new int[rows][cols];
        move(0, 0, threshold, rows, cols, flag);
        return count;
    }

    //offer_67
    public int cutRope(int target) {
        if (target==0) return 0;
        if (target==1) return 1;
        if (target==2) return 2;
        if (target==3) return 3;
        int result;
        if (target%3 == 0) {
            result = (int) Math.pow(3, target/3);
        } else if (target%3 == 1) {
            result = (int) Math.pow(3, target/3-1)*4;
        } else {
            result = (int) Math.pow(3, target/3)*2;
        }
        return result;
    }


}
