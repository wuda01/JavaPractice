package offercode.Arrarys;

import java.util.Arrays;

public class offer_37 {

    /**
     * 数字在排序数组中出现的次数
     * 统计一个数字在排序数组中出现的次数。
     */

    public static void main(String[] args) {
        //int[] arr = {1, 2, 3, 4, 5, 6, 6, 6, 6, 7, 8};
        int[] arr = {3,3,3,3,4};
        System.out.println(GetNumberOfK(arr, 3));

    }

    public static int GetNumberOfK(int [] array , int k) {
        int index = Arrays.binarySearch(array, k);
        //System.out.println(index);
        if (index < 0) return 0;
        int result = 1;
        for (int i=index+1; i<array.length && array[i]==k; i++) {
            result++;
        }
        for (int i=index-1; i>=0 && array[i]==k; i--) {
            result++;
        }
        return result;
    }
}
