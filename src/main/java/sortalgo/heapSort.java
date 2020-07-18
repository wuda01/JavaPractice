package sortalgo;

import java.util.Arrays;

public class heapSort {

    public static void main(String[] args) {

        int[] arr = {3,4,1,2,5,9,7,6,8};
        System.out.println(Arrays.toString(heap(arr)));

    }

    static int len;

    public static int[] heap(int[] arr){
        len = arr.length;
        if(arr.length<1) return arr;

        buildMax(arr);
        while(len>0){
            swap(arr, 0, len-1);
            len--;
            adjustArr(arr, 0);
        }
        return arr;
    }

    public static void buildMax(int[] arr){
        for(int i=len/2-1; i>=0; i--) adjustArr(arr, i);
    }

    public static void adjustArr(int[] arr, int i){

        int maxIndex = i;
        if(i*2+1<len && arr[i*2+1]>arr[maxIndex]) maxIndex = i*2+1;
        if(i*2+2<len && arr[i*2+2]>arr[maxIndex]) maxIndex = i*2+2;

        if(maxIndex != i){
            swap(arr, maxIndex, i);
            adjustArr(arr, maxIndex);
        }

    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}

