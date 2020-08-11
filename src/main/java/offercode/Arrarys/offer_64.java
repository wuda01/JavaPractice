package offercode.Arrarys;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class offer_64 {

    /**
     * 滑动窗口的最大值
     * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
     * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
     * 他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
     * {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
     * 窗口大于数组长度的时候，返回空
     */

    //暴力解法
    public static ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> result = new ArrayList<>();
        if (num.length<size || size<1) return result;
        int n = num.length-size+1;
        for (int i=0; i<n; i++) {
            int max = num[i];
            for (int j=i; j<i+size; j++) {
                max = Math.max(max, num[j]);
            }
            result.add(max);
        }
        return result;

    }

    //优化解法 --> 双向队列
    public static ArrayList<Integer> maxNewInWindows(int[] num, int size) {
        ArrayList<Integer> result = new ArrayList<>();
        if (num.length<size || size<1) return result;
        //int n = num.length-size+1; //窗口的数量
        Deque<Integer> dq = new ArrayDeque<Integer>();
        for (int i=0; i<num.length; i++) {
            while (!dq.isEmpty() && num[dq.getLast()]<num[i]) {
                dq.pollLast();
            }
            dq.offer(i);
            // 判断队列的头部的下标是否过期
            if (dq.getFirst()+size <= i) {
                dq.pollFirst();
            }
            // 判断是否形成了窗口
            if (i+1 >= size) {
                result.add(num[dq.getFirst()]);
            }
            //System.out.println(i);
        }
        return result;
    }



    public static void main(String[] args) {
        int[] a = {2,3,4,2,6,2,5,1}; //{4,4,6,6,6,5}
        int[] b = {10,14,12,11};
        System.out.println(maxInWindows(a, 3));
        System.out.println(maxNewInWindows(a, 3));
    }
}
