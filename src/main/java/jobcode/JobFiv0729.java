package jobcode;

import java.util.*;

public class JobFiv0729 {

    /**
     * 各不相同
     * @param nums
     * @return
     */

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

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(geBuXiangTong(nums)));
    }

}
