package Main;

import java.util.Arrays;
import java.util.Scanner;

public class Main01 {

    public static int sort(String inData){
        String[] arr = inData.split(" ");
        int len = arr.length;
        int[] nums = new int[len];
        int[] numsSort = new int[len];
        for(int i = 0;i<len;i++){
            nums[i] = Integer.parseInt(arr[i]);
            numsSort[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(numsSort);
        int count = 0;
        int j = 0;
        for (int i = 0; i < len; i++) {
            if(nums[i] == numsSort[j]){
                ++count;
                ++j;
            }
        }
        return len-count;
    }

    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        String s = "19 5 9 255";
        System.out.println(sort(s));

    }
}
