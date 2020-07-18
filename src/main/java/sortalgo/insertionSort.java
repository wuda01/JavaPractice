package sortalgo;

import java.util.Arrays;

public class insertionSort {

    public static void main(String[] args) {

        int[] arr = {5,2,4,5,8,1,2,3};
        System.out.println(Arrays.toString(insertion(arr)));

    }

    public static int[] insertion(int[] arr){
        if(arr.length==0) return null;

        int len = arr.length;
        int current;
        for(int i=1; i<=len-1; i++){
            current = arr[i];
            int index = i-1;
            while(index>=0 && current<arr[index]){
                arr[index+1] = arr[index];
                index--;
            }
            arr[index+1] = current;
        }
        return arr;
    }
}
