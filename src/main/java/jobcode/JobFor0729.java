package jobcode;

import java.util.Arrays;
import java.util.Scanner;

public class JobFor0729 {

    /**
     * 小草
     * @param m
     * @param x
     * @param ai
     * @return
     */

    public static int zuiAiXiaoCao(int m, int x, int[] ai) {
        final int n = ai.length;
        int minJ = 0;
        int minAi = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            if (ai[j] < minAi) {
                minAi = ai[j];
                minJ = j;
            }
        }
        ai[minJ] += x;

        for (int i = 1; i < m; i++) {
            int min = 0;
            minAi = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (ai[j] < minAi) {
                    minAi = ai[j];
                    min = j;
                }
            }
            ai[min] += x;
        }

        return ai[minJ];
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 小草的个数
        int m = sc.nextInt(); // 药剂的个数
        int x = sc.nextInt(); // 草长的高度

        int[] ai = new int[n];
        for (int i = 0; i < n; i++) {
            ai[i] = sc.nextInt();
        }
        System.out.println(zuiAiXiaoCao(m, x, ai));

    }

}
