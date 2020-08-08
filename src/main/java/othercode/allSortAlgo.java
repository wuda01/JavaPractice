package othercode;

import com.google.gson.internal.$Gson$Preconditions;

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

        int min;
        int current;
        for (int i=0; i<arr.length; i++) {
            min = i;
            for (int j=i; j<arr.length; j++) {
                if (arr[j]<arr[i]) min = j;
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
        if (arr.length==0) return;
        int[] result = qSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(result));
    }
    public static int[] qSort(int[] arr, int left, int right) {
        if (left>=right) return arr;
        int pivot = sort(arr, left, right);
        qSort(arr, 0, pivot-1);
        qSort(arr, pivot+1, right);
        return arr;
    }
    public static int sort(int[] arr, int left, int right) {
        int pivot = arr[left];
        while (left<right) {
            while (left<right && pivot<=arr[right]) right--;
            arr[left] = arr[right];
            while (left<right && pivot>=arr[left]) left++;
            arr[right] = arr[left];
        }
        arr[left] = pivot;
        return left;
    }

    //希尔排序
    public static void shellSort(int[] arr) {
        if (arr.length==0) return;
        int gap = arr.length / 2;
        while (gap>0) {
            int current = 0;
            for (int i=1; i<arr.length; i++) {
                int index = i - gap;
                current = arr[i];
                while (index>=0 && current<arr[index]) {
                    arr[index+gap] = arr[index];
                    index-=gap;
                }
                arr[index+gap] = current;
            }
            gap/=2;
        }
        System.out.println(Arrays.toString(arr));
    }

    //归并排序
    public static int[] mergeSort(int[] arr) {
        if (arr.length<2) return arr;
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        return merge(mergeSort(left), mergeSort(right));
    }
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length+right.length];
        for (int i=0,j=0,k=0; k<result.length; k++) {
            if (i>=left.length) result[k] = right[j++];
            else if (j>=right.length) result[k] = left[i++];
            else if (left[i]<=right[j]) result[k] = left[i++];
            else result[k] = right[j++];
        }
        return result;
    }

    //计数排序
    public static void countSort(int[] arr) {
        if (arr.length==0) return;
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]<=min) min = arr[i];
            if (arr[i]>=max) max = arr[i];
        }
        int[] count = new int[max-min+1];
        int[] result = new int[arr.length];
        for (int i=0; i<count.length; i++) {
            count[i] = 0;
        }
        for (int i=0; i<arr.length; i++) {
            count[arr[i]-min]++;
        }
        int index = 0;
        for (int i=0; i<count.length; i++) {
            int num = count[i];
            while (num!=0) {
                result[index] = i+min;
                num--;
                index++;
            }
        }
        System.out.println(Arrays.toString(result));
    }

    //冒泡排序
    public static void bubbleSort(int[] arr) {
        if (arr.length<1) return;
        int temp;
        for (int i=0; i< arr.length; i++) {
            boolean flag = false;
            for (int j=0; j<arr.length-1; j++) {
                if (arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
        System.out.println(Arrays.toString(arr));
    }

    //堆排序
    public static void heapSort(int[] arr) {

    }

    //main
    public static void main(String[] args) {
        //int[] arr = {5,2,4,5,8,1,2,3};
        //int[] arr = {25, 84,21,47,15,27,68,35,20};
        int[] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        insertSort(arr); //插入排序
        selectSort(arr); //选择排序
        quickSort(arr);  //快速排序
        shellSort(arr);  //希尔排序
        //归并排序
        System.out.println(Arrays.toString(mergeSort(arr)));
        //计数排序
        countSort(arr);
        //冒泡排序
        bubbleSort(arr);

    }

}
