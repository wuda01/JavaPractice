package jobTest;

import java.util.ArrayList;

public class JobTest13 {

    /**
     * 输入一个正整数n,输出一个最小正整数m，使得m的各位平方和等于n
     */

    public static void main(String[] args) {
        // 63 --> 1156
        test(63);
    }

    public static void test(int n){
        int firstNum = n;
        StringBuffer result = new StringBuffer();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        for (int i=9; i>=1; i--){
            while(firstNum>0 && firstNum>Math.pow(i, 2)){
                firstNum -= Math.pow(i,2);

            }
        }
        /*if (firstNum!=0) {
            return "-1";
        } else {
            return result.toString();
        }*/
    }
}
