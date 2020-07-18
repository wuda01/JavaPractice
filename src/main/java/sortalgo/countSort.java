package sortalgo;

import java.util.Arrays;

public class countSort {

    public static void main(String[] args) {

        int[] arr = {3,4,1,2,5,9,7,6,8};
        System.out.println(Arrays.toString(count(arr,1,9)));

    }

    public static int[] count(int[] arr, int min, int max){
        if(arr.length<1) return arr;

        int[] coun = new int[max-min+1];
        int[] ans = new int[arr.length];

        for(int i=min; i<=max; i++) coun[i-min] = 0;
        for(int i=0; i<arr.length; i++) coun[arr[i]-min]++;
        for(int i=min+1; i<=arr.length; i++) coun[i-min] += coun[i-min-1];
        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            int index = coun[num-min]-1; //元素应该在数组中的存放位置
            ans[index] = num;
            coun[num-min]--;
        }
        return ans;
    }
}
