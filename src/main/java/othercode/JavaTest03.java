package othercode;

import java.util.Arrays;

public class JavaTest03 {

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

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};
        /*for (int i = 0; i < 5; i++) {
            int res = (int) (Math.random()*arr.length-1);
            System.out.println(res);
        }*/

        System.out.println(Arrays.toString(randomSort(arr)));
    }
}
