package jobcode;


import java.util.Scanner;

public class Job0802_01 {

    /**
     * 题目描述
     * 真正的夏天，从清晨7点就开始空气就变得燥热，窗外蝉在叫。多多躺在床上，直
     * 勾勾地望着有些陌生的天花板，回忆着刚才的噩梦。
     * 在梦里，多多一个人在玩飞行棋，还剩一个棋子没到终点，距离终点还有K个格
     * 子。之后多多投了N 次骰子，多多清楚地记得每次投出的骰子点数是多少。但第
     * N 次骰子投出之后多多就从梦中醒来，不记得最终自己棋子是否到达终点。现在
     * 多多一直在回想最终自己到达终点没。。。。。。
     * 输入描述：
     * 输入共2行。
     * 第一行是2个整数 K,N,分别表示棋子最终到终点的距离以及之后投掷的骰
     * 子次数。其中 0《＝K<= 600,1<=N<=100.
     * 第二行包含 N个整数，其中第 i(1《＝i<=N)
     * 个整数 Di(1<=Di
     * 《＝6)表示第i 次投出的骰子点数。
     * 输出描述：
     */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[N];
        if (K==0) {
            System.out.println("paradox");
            return;
        }
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        int distance = K;
        int backCount = 0;
        for (int i=0; i<N; i++) {
            if (arr[i]<distance) {
                distance-=arr[i];
            } else if (arr[i]==distance) {
                if (i==N-1) System.out.println(0+" "+backCount);
                else System.out.println("paradox");
                return;
            } else if (arr[i]>distance) {
                backCount++;
                distance = arr[i] - distance;
            }
        }
        System.out.println(distance+" "+backCount);
    }
}
