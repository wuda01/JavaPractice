package jobTest;

import java.util.Scanner;

public class JobTest07 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int[] w = new int[N];
        int[] v = new int[N];
        for (int i=0; i<N; i++) {
            w[i] = sc.nextInt();
        }
        for (int i=0; i<N; i++) {
            v[i] = sc.nextInt();
        }
        System.out.println(knapSack(K, N, w, v));
    }

    public static int knapSack(int K, int N, int[] w, int[] v) {
        if (N==0 || K==0) return 0;
        if (w[N-1]>K) {
            return knapSack(K, N-1, w, v);
        } else {
            return Math.max(v[N-1]+knapSack(K-w[N-1], N-1, w, v), knapSack(K, N-1, w, v));
        }
    }

}
