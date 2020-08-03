package Acking;

public class acking003 {

    /**
     * 完全背包问题
     *
     * 有 N 种物品和一个容量是 V 的背包，每种物品都有无限件可用。第i种物品的体积是vi，价值是 wi。
     * 求解将哪些物品装入背包，可使这些物品的总体积不超过背包容量，且总价值最大。输出最大价值。
     * 输入格式
     * 第一行两个整数，N，V，用空格隔开，分别表示物品种数和背包容积。
     * 接下来有 N 行，每行两个整数 vi,wi，用空格隔开，分别表示第 i 种物品的体积和价值。
     * 输出格式
     * 输出一个整数，表示最大价值。
     * 数据范围
     * 0<N,V≤1000
     * 0<vi,wi≤1000
     * 输入样例
     * 4 5
     * 1 2
     * 2 4
     * 3 4
     * 4 5
     * 输出样例：
     * 10
     */

    public static void maxValue(int[] v, int[] w, int N, int V){
        int[] dp = new int[1002]; //初始数组全为0
        for (int i=1; i<=N; i++) {
            for (int j=V; j>=v[i]; j--) {
                for (int k=0; k*v[i]<=j; k++) {
                    dp[j] = Math.max(dp[j], dp[j-k*v[i]]+k*w[i]);
                }
            }
        }
        System.out.println(dp[V]);
    }

    public static void maxNewValue(int[] v, int[] w, int N, int V){
        int[] dp = new int[1002]; //初始数组全为0
        for (int i=1; i<=N; i++) {
            for (int j=v[i]; j<=V; j++) {
                dp[j] = Math.max(dp[j], dp[j-v[i]]+w[i]);
            }
        }
        System.out.println(dp[V]);
    }

    //main
    public static void main(String[] args) {
        int[] v = {0,1,2,3,4};
        int[] w = {0,2,4,4,5};
        int N = 4;
        int V = 5;

        //maxValue(v, w, N, V);
        maxValue(v, w, N, V);
    }
}
