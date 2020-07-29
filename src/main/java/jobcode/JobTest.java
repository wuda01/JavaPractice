package jobcode;

import java.util.Arrays;
import java.util.Scanner;

public class JobTest {

        public static int zuiAiXiaoCao(int m, int x, int[] ai) {
            final int n = ai.length;
            int minJ = 0;
            int minAi = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (ai[j] < minAi) {
                    minAi = ai[j];
                    minJ = j;
                }
            }
            ai[minJ] += x;

            for (int i = 1; i < m; i++) {
                int min = 0;
                minAi = Integer.MAX_VALUE;
                for (int j = 0; j < n; j++) {
                    if (ai[j] < minAi) {
                        minAi = ai[j];
                        min = j;
                    }
                }
                ai[min] += x;
            }

            return ai[minJ];
        }

        public static int[] geBuXiangTong(int[] nums) {
            int n = nums.length;
            for (; ; ) {
                int minI = -1;
                int minV = Integer.MAX_VALUE;
                for (int i = 1; i < n; i++) {
                    if (nums[i] == nums[i - 1] && nums[i] < minV) {
                        minI = i;
                        minV = nums[i];
                    }
                }
                if (minI < 0) {
                    break;
                }
                nums[minI] *= 2;
                System.arraycopy(nums, minI, nums, minI - 1, n - minI);
                if (n - 1 <= 0) {
                    break;
                }
                n--;
            }
            return Arrays.copyOf(nums, n);

        }


    public static void main(String[] args) {


        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 小草的个数
        int m = sc.nextInt(); // 药剂的个数
        int x = sc.nextInt(); // 草长的高度

        int[] ai = new int[n];
        for (int i = 0; i < n; i++) {
            ai[i] = sc.nextInt();
        }
        System.out.println(zuiAiXiaoCao(m, x, ai));*/


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(geBuXiangTong(nums)));
    }

}


