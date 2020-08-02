package jobTest;

import java.util.Arrays;
import java.util.Scanner;

public class JobTest04{


    // main
    public static void main(String[] args) {
        // int n = 4;
        // int[] nums = {1,4,1,2,2,3,3,4};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n*2];
        for (int i = 0; i < 2*n; i++) {
            nums[i] = sc.nextInt();
        }

    }
}