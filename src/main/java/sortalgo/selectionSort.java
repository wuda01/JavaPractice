package sortalgo;

import java.util.Arrays;

public class selectionSort {

    public static void main(String[] args) {

        int[] arr = {5,2,4,5,8,1,2,3};
        System.out.println(Arrays.toString(selection(arr)));

    }

    public static int[] selection(int [] arr){

        if(arr.length==0) return null;

        int len = arr.length;
        for(int i=0; i<=len-1; i++){
            int min = i;
            int temp;
            for(int j=i; j<=len-1; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            if(min != i){
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        return arr;
    }
}
