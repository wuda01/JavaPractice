package leetcode;

import java.util.Arrays;

public class code739 {

    public static void main(String[] args) {

        int[] t1 = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(dailyTemperatures(t1)));

    }

    /**
     请根据每日 气温 列表，重新生成一个列表。对应位置的输出为：要想观测到更高的气温，至少需要等待的天数。如果气温在这之后都不会升高，请在该位置用 0 来代替。
     例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
     提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的均为华氏度，都是在 [30, 100] 范围内的整数。
     */

    public static int[] dailyTemperatures(int[] T) {
        int[] res = new int[T.length];
        for (int i = res.length - 1; i >= 0; i--) {
            int j = i + 1;
            while (j < res.length) {
                if (T[j] > T[i]) {
                    res[i] = j - i;
                    break;
                } else if (res[j] == 0) {
                    break;
                } else {
                    j += res[j];
                }
            }
        }
        return res;
    }

}
