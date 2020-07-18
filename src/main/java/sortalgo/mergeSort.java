package sortalgo;

import java.util.Arrays;

public class mergeSort {

    public static void main(String[] args) {

        int[] arr = {5,2,4,5,8,1,2,3};
        System.out.println(Arrays.toString(merge(arr)));

    }

    public static int[] merge(int[] arr){
        if(arr.length<2) return arr;
        int mid = arr.length / 2;

        int[] left = Arrays.copyOfRange(arr,0,mid);
        int[] right = Arrays.copyOfRange(arr,mid,arr.length);
        return mergesort(merge(left),merge(right));
    }

    public static int[] mergesort(int[] left,int[] right){
        int[] ans = new int[left.length+right.length];

        for(int index=0,i=0,j=0; index<ans.length; index++){
            if(i>=left.length){
                ans[index] = right[j++];
                //j++;
            }else if(j>=right.length){
                ans[index] = left[i++];
                //i++;
            }else if(left[i]>right[j]){
                ans[index] = right[j++];
                //j++;
            }else {
                ans[index] = left[i++];
                //i++;
            }
        }
        return ans;
    }
}
