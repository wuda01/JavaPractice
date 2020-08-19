package offercode.Arrarys;

import java.util.HashMap;

public class offer_28 {

    /**
     * 数组中出现次数超过一半的数字
     * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
     * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
     * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
     */

    public static void main(String[] args) {

        int[] arr = {1,2,3,2,2,2,5,4,2};
        System.out.println(newMoreThanHalfNum_Solution(arr));
    }

    public static int newMoreThanHalfNum_Solution(int[] array) {
        if (array.length<1) return 0;
        int len = array.length / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i])+1);
            } else {
                map.put(array[i], 1);
            }
            if (map.get(array[i])>len) {
                return array[i];
            }
        }
        return 0;
    }

    public static int MoreThanHalfNum_Solution(int [] array) {

        if (array==null || array.length==0) return 0;

        int preValue = array[0];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == preValue) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    preValue = array[i];
                    count = 1;
                }
            }
        }

        int nums = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == preValue) {
                nums++;
            }
        }

        if (nums > array.length/2) {
            return preValue;
        } else {
            return 0;
        }
    }
}
