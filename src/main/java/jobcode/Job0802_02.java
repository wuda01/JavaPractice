package jobcode;

import java.util.Scanner;

public class Job0802_02 {

    /**
     * 题目描述
     * 今天公司提供了N套中餐和M套晚餐，每种套餐分别有一个热量值X和美味值Y.
     * 小多想知道，在满足美味值之和不少于T的情况下，最少可以摄入多少热量值？
     * 注意：
     * 每顿饭最多只能选择一种套餐，小多可以选择只吃一顿饭甚至不吃饭。
     * 输入描述：
     * 第一行三个整数N,M,T,分别表示中餐种数，晚餐种数以及小多需要满足的最少美味值
     * 然后N行第i行两个整数xi和Yi,表示第i套中餐的热量值和美味值
     * 最后M行第j行两个整数xj和Yj,表示第j套晚餐的热量值和美味值
     * 输出描述：
     * 一个整数，表示小多在这两顿饭的美味值之和不少于r的前提下，最少摄入的
     * 热量值
     * 如果小多两顿饭的美味值之和无论如何都无法达到r,则输出－1
     * 输入：
     * 5 1 9
     * 9 1
     * 4 9
     * 3 1
     * 2 3
     * 6 5
     * 9 8
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //午餐种类
        int M = sc.nextInt(); //晚餐种类
        int T = sc.nextInt(); //美味值
        if (T == 0) {
            System.out.println(0);
        } else {
            String[] arrN = new String[N];
            String[] arrM = new String[M];
            sc.nextLine();
            for (int i = 0; i < N; i++) {
                arrN[i] = sc.nextLine();
            }
            //System.out.println(Arrays.toString(arrN));
            for (int i = 0; i < M; i++) {
                arrM[i] = sc.nextLine();
            }
            //System.out.println(Arrays.toString(arrM));
            int nums = Integer.MAX_VALUE;
            boolean flag = false;
            for (int i = 0; i < arrN.length; i++) {
                int n1 = Integer.parseInt(arrN[i].split(" ")[0]);
                int n2 = Integer.parseInt(arrN[i].split(" ")[1]);
                if (n2 >= T) {
                    flag = true;
                    nums = n1;
                }
                for (int j = 0; j < arrM.length; j++) {
                    int m1 = Integer.parseInt(arrM[j].split(" ")[0]);
                    int m2 = Integer.parseInt(arrM[j].split(" ")[1]);
                    if (m2 >= T) {
                        flag = true;
                        nums = Math.min(nums, m1);
                    }
                    if (n2+m2>=T && n2<T && m2<T) {
                        flag = true;
                        nums = Math.min(nums, n1 + m1);
                    }
                }
            }
            if (flag) System.out.println(nums);
            else System.out.println(-1);
        }
    }
}
