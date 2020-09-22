package jobTest;

import java.util.*;

public class JobTest22{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        int len = arr.length;
        int[] nums = new int[len];
        int[] numssort = new int[len];
        for(int i = 0;i<len;i++){
            nums[i] = Integer.parseInt(arr[i]);
        }
        numssort = nums.clone();
        Arrays.sort(numssort);
        int count=0;
        for(int j = 0; j<len; j++){
            if(nums[j]!=numssort[j])
                count++;
        }
        System.out.println(count);
    }

}
