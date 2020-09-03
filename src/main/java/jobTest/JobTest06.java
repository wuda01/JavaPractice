package jobTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class JobTest06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i=0; i<n; ++i) {
            nums[i] = sc.nextInt();
        }

        int[] arr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(arr);
        HashMap<Integer, Integer> next = new HashMap<>();
        for (int i=0; i<n-1; ++i) {
            next.put(arr[i], arr[i+1]);
        }
        next.put(arr[n-1], Integer.MAX_VALUE);

        HashMap<Integer, Integer> dp = new HashMap<>();
        dp.put(nums[n-1], 1);

        int maxlen = 1;
        for (int i=n-2; i>=0; --i) {
            if (dp.containsKey(next.get(nums[i]))) {
                dp.put(nums[i], dp.get(next.get(nums[i]))+1);
            } else {
                dp.put(nums[i], 1);
            }
            maxlen = Math.max(maxlen, dp.get(nums[i]));
        }
        System.out.println(n-maxlen);
    }
}
