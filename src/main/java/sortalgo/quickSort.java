package sortalgo;

import java.util.Arrays;

public class quickSort {

    public static void main(String[] args) {

        int[] arr = {5,2,4,5,8,1,2,3};
        System.out.println(Arrays.toString(quick(arr)));
    }

    private static int[] quick(int [] arr){
        return qsort(arr,0,arr.length-1);
    }

    public static int[] qsort(int[] arr, int left, int right) {
        if(left>=right) return arr;

        int pivot = partition(arr,left,right);
        qsort(arr,left,pivot-1);
        qsort(arr,pivot+1,right);

        return arr;
    }


    private static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        while(low < high){
            while(low<high && arr[high]>=pivot) high--;
            arr[low] = arr[high];
            while (low<high && arr[low]<=pivot) low++;
            arr[high] = arr[low];
        }
        arr[low] = pivot;
        return low;
    }

}
