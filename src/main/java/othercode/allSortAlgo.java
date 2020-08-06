package othercode;

import java.util.Arrays;

public class allSortAlgo {

    //插入排序
    public static void insertSort(int[] arr) {
        if (arr.length==0) return;

        int current = 0;
        for (int i=1; i<arr.length; i++) {
            int index = i-1;
            current = arr[i];
            while (index>=0 && current<arr[index]) {
                arr[index+1] = arr[index];
                index--;
            }
            arr[index+1] = current;
        }
        System.out.println(Arrays.toString(arr));
    }

    //选择排序
    public static void selectSort(int[] arr) {
        if (arr.length==0) return;

        int min = 0;
        int current = 0;
        for (int i=0; i<arr.length; i++) {
            min = i;
            for (int j=i; j<arr.length; j++) {
                if (arr[j]<arr[i]) {
                    min = j;
                }
            }
            if (min != i) {
                current = arr[i];
                arr[i] = arr[min];
                arr[min] = current;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //快速排序
    public static void quickSort(int[] arr) {

    }

    //main
    public static void main(String[] args) {
        int[] arr = {5,2,4,5,8,1,2,3};
        insertSort(arr);
        selectSort(arr);
    }

}
