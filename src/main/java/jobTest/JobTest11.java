package jobTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JobTest11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int M = sc.nextInt(); //奶牛数量
        int N = sc.nextInt(); //特性数量
        int[][] sum = new int[N][M];
        for (int i=0; i<N; i++) {
            int g = sc.nextInt(); //满足特性种类
            for (int j=0; j<g; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                for (int k=a; k<=b; k++) {
                    sum[i][k-1] = k;
                }
            }
        }
        System.out.println(Arrays.toString(sum[0]));
        System.out.println(Arrays.toString(sum[1]));

        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        ok:
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                if (sum[j][i]==0) continue ok;
            }
            count++;
            list.add(i+1);
        }

        System.out.println(count);
        System.out.println(list);
    }
}
