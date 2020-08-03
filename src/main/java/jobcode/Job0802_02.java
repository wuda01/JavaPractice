package jobcode;

import java.util.Scanner;

public class Job0802_02 {

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
