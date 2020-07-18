package sortalgo;

import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args) {

        int[] arr = {5,2,4,5,8,1,2,3};
        System.out.println(Arrays.toString(bubble(arr)));

    }

    public static int[] bubble(int [] arr){

        if(arr.length==0) return null;
        int len = arr.length;
        int temp;
        for(int i=0; i<=len-1; i++){
            boolean swap = false;
            for(int j=0; j<=len-2; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }
            if(swap==false) break;
        }
        return arr;
    }
}
