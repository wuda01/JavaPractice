package sortalgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class bucketSort {

    public static void main(String[] args) {

        int[] arr = {3,4,1,2,5,9,7,6,8};
        System.out.println(Arrays.toString(bucket(arr)));
    }

    public static int[] bucket(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }

        int buckNum= (max-min)/arr.length+1;
        ArrayList<ArrayList<Integer>> arrList = new ArrayList<ArrayList<Integer>>(buckNum);
        for(int i=0; i<buckNum; i++){
            arrList.add(new ArrayList<Integer>());
        }

        for(int i=0; i<arr.length; i++){
            int num = (arr[i]-min)/arr.length; //根据元素的大小放进桶中
            arrList.get(num).add(arr[i]);
        }

        for(int i=0; i<arrList.size(); i++){
            Collections.sort(arrList.get(i));
        }



        for(int i=0; i<arr.length; i++){
            arr[i] = arrList.get(0).get(i);
        }
        //System.out.println(arrList.get(0));
        return arr;
    }


}
