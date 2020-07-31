package jobcode;

import java.util.Scanner;

public class Job0731_01 {

    public static int[] C = new int[5];
    public static int[] V = new int[]{1,5,10,50,100};
    public static int k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            C[i] = sc.nextInt();
        }
        k = sc.nextInt();
        sc.close();
        solve();
    }

    public static void solve() {
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
