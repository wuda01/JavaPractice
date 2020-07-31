package jobcode;

import java.util.Scanner;

public class Job0731_01 {

    public static int[] V = new int[]{1,5,10,50,100};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] C = new int[5];
        for (int i = 0; i < 5; i++) {
            C[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        sc.close();
        solve(C, k);
    }

    public static void solve(int[] C, int k) {
        int ans = 0;
        for (int i = 4; i >= 0; --i) {
            int t = Math.min(k/V[i], C[i]);
            ans+=t;
            k-=t*V[i];
        }
        if (k!=0) {
            System.out.println(-1);
            return;
        }
        System.out.println(ans);
    }

}
