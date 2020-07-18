package sortalgo;

import java.util.Arrays;

public class shellSort {

    public static void main(String[] args) {

        int[] arr = {5,2,4,5,8,1,2,3};
        System.out.println(Arrays.toString(shell(arr)));

    }

    public static int[] shell(int[] arr){
        if(arr.length==0) return null;

        int len = arr.length;
        int gap = len/2;
        while(gap>0){
            int current;
            for(int i=1; i<=len-1; i++){
                current = arr[i];
                int index = i-gap;
                while(index>=0 && current<arr[index]){
                    arr[index+gap] = arr[index];
                    index-=gap;
                }
                arr[index+gap] = current;
            }
            gap /= 2;
        }
        return arr;
    }
}
