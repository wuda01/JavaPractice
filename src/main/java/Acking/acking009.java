package Acking;

import java.util.Arrays;
import java.util.Scanner;

public class acking009 {

    /**
     * 分组背包问题
     *
     * 有N组物品和一个容量是V的背包。每组物品有若干个，同一组内的物品最多只能选一个。
     * 每件物品的体积是vij，价值是 wij，其中i是组号，j是组内编号。
     * 求解将哪些物品装入背包，可使物品总体积不超过背包容量，且总价值最大。输出最大价值。
     * 输入格式
     * 第一行有两个整数 N，V，用空格隔开，分别表示物品组数和背包容量。
     * 接下来有 N 组数据：
     * 每组数据第一行有一个整数 Si，表示第 i 个物品组的物品数量；
     * 每组数据接下来有Si行，每行有两个整数 vij,wij，用空格隔开，分别表示第i个物品组的第j个物品的体积和价值；
     * 输出格式
     * 输出一个整数，表示最大价值。
     * 数据范围
     * 0<N,V≤100
     * 0<Si≤100
     * 0<vij,wij≤100
     * 输入样例
     * 3 5
     * 2
     * 1 2
     * 2 4
     * 1
     * 3 4
     * 1
     * 4 5
     * 输出样例：
     * 8
     */

    public static int maxValue(int[] v, int[] w, int[] dp, int V, int M) {

        for (int j=V; j>=0; j--) {  //背包容量循环
            for (int k=0; k<M; k++) { //组内循环
                if (j>=v[k]) {
                    dp[j] = Math.max(dp[j], dp[j-v[k]]+w[k]);
                }
            }
        }
        return dp[V];
    }

    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        int maxV = 105;
        int maxN = 105;
        int[] dp = new int[maxV];
        int[] v = new int[maxN];
        int[] w = new int[maxN];

        int N = sc.nextInt();
        int V = sc.nextInt();
        int M;
        dp[0] = 0;
        for (int i = 0; i < N; i++) {
            M = sc.nextInt();
            for (int j = 0; j < M; j++) {
                v[j] = sc.nextInt();
                w[j] = sc.nextInt();
            }
            maxValue(v, w, dp, V, M);
        }
        System.out.println(dp[V]);*/

        int[][] vx = {{1,2},{3},{4}};
        int[][] wx = {{2,4},{4},{5}};
        int[] Mx = {2,1,1};

        int M; //组内物品个数
        int N = 3; //分组个数
        int V = 5; //背包容量
        int[] v;
        int[] w;
        int[] dp = new int[105];
        for (int i = 0; i < N; i++) { //组循环
            M = Mx[i];
            v = vx[i];
            w = wx[i];
            maxValue(v, w, dp, V, M);
        }
        System.out.println(dp[V]);
    }

}
