package jobcode;

import java.util.Arrays;
import java.util.Scanner;

public class Job0801_01 {

    /**
     * 小猿非常热爱学习，所以他在猿辅导上购买了N节课来提升自己，每节课有一个开
     * 始时间S和结束时间E(S和E均用正整数表示）。买完课程后，粗心的小猿发现这
     * 些课程之间有些时间冲突，幸好小猿有一种“一心多用”的超能力，能同时兼顾K节
     * 课上课。当然是K越大，使用这种能力就越累。请问小猿最少需要一心几用，才能
     * 上完所有他买的课程呢？
     * 输入描述：
     * 第一行输入为N(N≤ 200000),表示购买课程数。
     * 接下来N行，每行输入两个数Si Ei(0《Si<Ei<1e9),为第i节课
     * 的起止时间。
     * 输出描述：
     * 请输出最小满足条件的K.
     * 4
     * 1 4
     * 1 2
     * 2 3
     * 3 4
     */

    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[n];
        int[] dep = new int[n];
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] sa = line.split(" ");
            arr[i] = Integer.parseInt(sa[0]);
            dep[i] = Integer.parseInt(sa[1]);
        }*/

        int n = 4;
        int[] arr = {1,1,2,3};
        int[] dep = {4,2,3,4};
        int result = find(arr, dep);
        System.out.println(result);
        //sc.close();
    }


    static int find(int arr[], int dep[]) {
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
