package Acking;

import java.util.Scanner;

public class acking004 {
    /**
     * 多重背包问题 I
     * 有 N 种物品和一个容量是 V 的背包。第 i 种物品最多有 si 件，每件体积是 vi，价值是 wi。
     * 求解将哪些物品装入背包，可使物品体积总和不超过背包容量，且价值总和最大。
     * 输出最大价值。
     * 输入格式
     * 第一行两个整数，N，V，用空格隔开，分别表示物品种数和背包容积。
     * 接下来有 N 行，每行三个整数 vi,wi,si，用空格隔开，分别表示第 i 种物品的体积、价值和数量。
     * 输出格式
     * 输出一个整数，表示最大价值。
     * 数据范围
     * 0<N,V≤100
     * 0<vi,wi,si≤100
     * 输入样例
     * 4 5
     * 1 2 3
     * 2 4 1
     * 3 4 3
     * 4 5 2
     * 输出样例：
     * 10
     */

    public static void maxValue(int[] v, int[] w, int[] s, int N, int V) {
        int[][] dp = new int[N+1][V+1];

        for (int i=1; i<=N; i++) {
            for (int j=V; j>=0; j--) {
                for (int k=0; k<=s[i]; k++) {
                    if (j>=k*v[i]) {
                        dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-k*v[i]]+k*w[i]);
                    } else {
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
        }
        System.out.println(dp[N][V]);
    }

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int V = sc.nextInt();
            int v[] = new int[N + 1];
            int w[] = new int[N + 1];
            int s[] = new int[N + 1];
            int[][] dp = new int[N + 1][V + 1];
            for (int i = 1; i < N + 1; i++) {
                v[i] = sc.nextInt();
                w[i] = sc.nextInt();
                s[i] = sc.nextInt();
            }
        }*/

        int N = 4;
        int V = 5;


        int[] v = {0,1,2,3,4};
        int[] w = {0,2,4,4,5};
        int[] s = {0,3,1,3,2};

        maxValue(v, w, s, N, V);

    }
}
