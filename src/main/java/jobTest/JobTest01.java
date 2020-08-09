package jobTest;

import org.codehaus.jackson.map.ser.std.ScalarSerializerBase;

import java.util.Arrays;
import java.util.Scanner;

public class JobTest01 {

    public static boolean maxValue(int[] v, int N, int V) {
        int[] dp = new int[V+1]; //初始数组全为0
        //产生的最大价值为：第i个在v[i]空间内的价值 + 前i-1在(j-v[i])空间内产生的价值
        for (int i=0; i<N; i++) {
            for (int j=V; j>=v[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j-v[i]]+v[i]);
                //System.out.println(i+"-此时dp[j]的值为："+dp[j]);
            }
        }
        if (dp[V]==V) return true;
        return false;
    }

    public static int arraySum(int[] a, int begin) {

        if (begin == a.length)
            return 0;
        int x = arraySum(a, begin + 1);
        return x + a[begin];

    }

    //main
    public static void main(String[] args) {
/*        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i=0; i<a; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j=0; j<n; j++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            //计算数组的和
            int total = arraySum(arr, 0);
            int result = Integer.MAX_VALUE;
            for (int m=arr.length; m>=2; m--) {
                for (int k=m-2; k>=0; k--) {
                    int[] tem = Arrays.copyOfRange(arr, k, m);
                    int sum = arraySum(tem, 0);
                    boolean flag = maxValue(tem, tem.length, sum / 2);
                    if (flag) result = Math.min(result, total - sum);
                }

            }
            System.out.println(result);
        }*/


        int[] arr = {30, 60, 5, 15, 30};
        //数组排序
        Arrays.sort(arr);
        //计算数组的和
        int total = arraySum(arr, 0);
        int result = Integer.MAX_VALUE;
        for (int i = arr.length; i>=2; i--) {
            for (int j = i-2; j>=0; j--) {
                int[] tem = Arrays.copyOfRange(arr, j, i);
                int sum = arraySum(tem, 0);
                boolean flag = maxValue(tem, tem.length, sum / 2);
                if (flag) result = Math.min(result, total - sum);
            }

        }
        System.out.println(result);

    }


}

