package jobTest;

import java.util.Arrays;
import java.util.Scanner;

public class JobTest03 {

    /**
     * 火车站进站问题
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[n];
        int[] dep = new int[n];
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] sa = line.split(" ");
            arr[i] = Integer.parseInt(sa[0]);
            dep[i] = Integer.parseInt(sa[1]);
        }
        int result = find(arr, dep, n);
        System.out.println(result);
        sc.close();
    }


    static int find(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int result = 0;
        int need = 1;
        int i = 1;
        int j = 0;
        while (i < arr.length && j < dep.length) {
            if(arr[i] < dep[j]) {
                need += 1;
                i++;
                if(need > result) {
                    result = need;
                }
            } else {
                need -= 1;
                j++;
            }
        }
        return result;
    }

}
