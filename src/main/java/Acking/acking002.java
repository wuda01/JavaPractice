package Acking;

public class acking002 {

    /**
     * 01背包问题
     *
     * 有N件物品和一个容量是V的背包。每件物品只能使用一次。第i件物品的体积是vi，价值是wi。
     * 求解将哪些物品装入背包，可使这些物品的总体积不超过背包容量，且总价值最大。
     * 输出最大价值。
     * 输入格式
     * 第一行两个整数，N，V，用空格隔开，分别表示物品数量和背包容积。
     * 接下来有N行，每行两个整数vi,wi，用空格隔开，分别表示第i件物品的体积和价值。
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
     * 8
     */

    public static void maxValue(int[] v, int[] w, int N, int V) {
        int[][] dp = new int[N+1][V+1];
        dp[0][0] = 0;
        for (int i=1; i<=N; i++) {
            for (int j=0; j<=V; j++) {
                if (j>=v[i]) {
                    //dp[i][j]需要用到dp表的上一层值和左上角的值来确定
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-v[i]]+w[i]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[N][V]);
    }

    public static void maxNewValue(int[] v, int[] w, int N, int V) {
        int[] dp = new int[V+1]; //初始数组全为0
        dp[0] = 0;
        //产生的最大价值为：第i个在v[i]空间内的价值 + 前i-1在(j-v[i])空间内产生的价值
        for (int i=1; i<=N; i++) {
            for (int j=V; j>=v[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j-v[i]]+w[i]);
                //System.out.println(i+"-此时dp[j]的值为："+dp[j]);
            }
        }
        System.out.println(dp[V]);
    }

    //main
    public static void main(String[] args) {
        /*int[] v = {0,1,2,3,4};
        int[] w = {0,2,4,4,5};
        int N = 4;
        int V = 5;*/

        int[] v = {0,20,12,11,10,9};
        int[] w = {0,24,14,12,10,7};
        int N = 5;
        int V = 50;

        maxValue(v, w, N, V);
        maxNewValue(v, w, N, V);
    }


}
