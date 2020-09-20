package jobTest;

import java.util.Scanner;

public class JobTest06 {

    private static int aaj = 0;
    private static int zeroNum(int i) {
        int zn = i / 5;
        int aa = cs(zn);
        aaj = 0;
        zn = zn + aa;
        return zn;
    }

    private static int cs(int i) {
        int j = i / 5;
        if (j>=5) {
            aaj += j;
            cs(j);
        } else {
            aaj += j;
        }
        return aaj;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(zeroNum(num));
    }
}
