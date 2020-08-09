package othercode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaTest01 {

    public static int[] randomSort(int[] arr){
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int tem = (int) (Math.random()*(arr.length-i));
            //System.out.println(tem);
            ans[i] = arr[tem];

            arr[tem] = arr[arr.length-i-1];
            arr[arr.length-i-1] = ans[i];
        }
        return ans;
    }

    public static boolean check(int num) {
        boolean flag = true;
        while (num > 1) {
            if (num%2 == 0) {
                num/=2;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};
        /*for (int i = 0; i < 5; i++) {
            int res = (int) (Math.random()*arr.length-1);
            System.out.println(res);
        }*/

        //System.out.println(Arrays.toString(randomSort(arr)));

        System.out.println(Integer.MAX_VALUE);
        //System.out.println(check(20));

        List<Integer> list = new ArrayList<>();
        for (int i=0; i<5; i++) {
            list.add(i);
        }
        System.out.println(list.get(3));
        list.remove(3);
        System.out.println(list.get(2));
    }
}
