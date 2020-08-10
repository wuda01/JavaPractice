package offercode.Arrarys;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class offer_50 {

    /**
     * 数组中的重复数字
     * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，
     * 但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
     * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
     */

    public static int[] duplicate(int[] numbers, int length) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<length; i++) {
            if (!map.containsKey(numbers[i])) {
                map.put(numbers[i], 1);
            } else {
                map.put(numbers[i], map.get(numbers[i])+1);
            }
        }
        for (int i=0; i<length; i++) {
            if (map.get(numbers[i])!=1) {
                if (!list.contains(numbers[i])) {
                    list.add(numbers[i]);
                    //System.out.print(numbers[i]+" ");
                }
            }
        }
        int[] result = new int[list.size()];
        for (int i=0; i<result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,3,4,5,3,4,5};
        System.out.println(Arrays.toString(duplicate(arr, arr.length)));
    }
}
