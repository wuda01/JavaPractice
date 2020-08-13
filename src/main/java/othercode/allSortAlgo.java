package othercode;

import org.apache.hadoop.yarn.webapp.hamlet.Hamlet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class allSortAlgo {

    //插入排序
    public static void insertSort(int[] arr) {
        if (arr.length<1) return;
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
        System.out.println(Arrays.toString(arr)+"  //插入排序");
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
        System.out.println(Arrays.toString(arr)+"  //选择排序");
    }

    //快速排序
    public static void quickSort(int[] arr) {
        if (arr.length==0) return;
        int[] result = qSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(result)+"  //快速排序");
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
        System.out.println(Arrays.toString(arr)+"  //希尔排序");
    }

    //归并排序
    public static void mergeSort(int[] arr) {
        System.out.println(Arrays.toString(preMerge(arr))+"  //归并排序");
    }
    public static int[] preMerge(int[] arr) {
        if (arr.length<2) return arr;
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        return merge(preMerge(left), preMerge(right));
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
        if (arr.length<1) return;
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
        System.out.println(Arrays.toString(result)+"  //计数排序");
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
        System.out.println(Arrays.toString(arr)+"  //冒泡排序");
    }

    //基数排序
    public static void radixSort(int[] arr) {
        if (arr.length<1) return;
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            max = Math.min(max, arr[i]);
        }
        int maxValue = 0;
        while (max>0) {
            max = max / 10;
            maxValue++;
        }
        int mod=10, div=1;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i=0; i<10; i++) {
            list.add(new ArrayList<>());
        }
        for (int i=0; i<maxValue; i++, mod*=10, div*=10) {
            for (int j=0; j<arr.length; j++) {
                int num = arr[i] % mod / div;
                list.get(num).add(arr[i]);
            }
            int index = 0;
            for (int m=0; m<list.size(); m++) {
                for (int n=0; n<list.get(m).size(); n++) {
                    arr[index] = list.get(m).get(n);
                }
                list.get(m).clear();
            }
        }
        System.out.println(Arrays.toString(arr)+"  //基数排序");
    }

    //堆排序
    public static int len;
    public static void heapSort(int[] arr) {
        if (arr.length<1) return;
        len = arr.length;
        buildMax(arr);
        while (len > 0) {
            swap(arr, 0, len-1);
            len--;
            adjustMax(arr,0);
        }
        System.out.println(Arrays.toString(arr)+"  //堆排序");
    }
    public static void buildMax(int[] arr) {
        for (int i=len/2-1; i>=0; i--) {
            adjustMax(arr, i);
        }
    }
    public static void adjustMax(int[] arr, int i) {
        int maxIndex = i;
        if (i*2+1<len && arr[i*2+1]>arr[maxIndex])
            maxIndex = i*2+1;
        if (i*2+2<len && arr[i*2+2]>arr[maxIndex])
            maxIndex = i*2+2;
        if (maxIndex != i) {
            swap(arr, maxIndex, i);
            adjustMax(arr, maxIndex);
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //桶排序
    public static void bucketSort(int[] arr) {
        if (arr.length < 2)
            System.out.println(arr);;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        int bucketNum = (max-min)/arr.length+1;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(bucketNum);
        for (int i=0; i<bucketNum; i++) {
            list.add(new ArrayList<>());
        }
        for (int i=0; i<arr.length; i++) {
            int num = (arr[i]-min)/arr.length;
            list.get(num).add(arr[i]);
        }
        for (int i=0; i<bucketNum; i++) {
            Collections.sort(list.get(i));
        }
        int index = 0;
        for (int i=0; i<list.size(); i++) {
            for (int j=0; j<list.get(i).size(); j++) {
                arr[index] = list.get(i).get(j);
                index++;
            }
        }
        System.out.println(Arrays.toString(arr)+"  //桶排序");
    }


    //main
    public static void main(String[] args) {
        //int[] arr = {5,2,4,5,8,1,2,3};
        //int[] arr = {25, 84,21,47,15,27,68,35,20};
        int[] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};

        insertSort(arr);  //插入排序
        selectSort(arr);  //选择排序
        quickSort(arr);   //快速排序
        shellSort(arr);   //希尔排序
        mergeSort(arr);   //归并排序
        countSort(arr);   //计数排序
        bubbleSort(arr);  //冒泡排序
        radixSort(arr);   //基数排序
        heapSort(arr);    //堆排序
        bucketSort(arr);  //桶排序


    }

}
