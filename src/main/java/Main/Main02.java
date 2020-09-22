package Main;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main02 {

    public static int[] pushIntArray(int[] arr, int pushOffset){
        int len = arr.length;
        int j=0;
        while(pushOffset>len) {
            pushOffset-=len;
        }
        //int a1=pushOffset;
        int copy[]=new int [pushOffset];
        for(int i=len-pushOffset;i<len;i++,j++) {
            copy[j] = arr[i];
        }
        for (int i = len-pushOffset-1; i >=0; i--) {
            arr[len-1] = arr[i];
            len--;
        }
        for (int i = 0; i < pushOffset; i++) {
            arr[i]=copy[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(pushIntArray(arr,2)));
    }
}
