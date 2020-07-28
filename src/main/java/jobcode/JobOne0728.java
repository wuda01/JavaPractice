package jobcode;

import java.math.BigInteger;
import java.util.Scanner;

public class JobOne0728 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int p = sc.nextInt();

        BigInteger MAX = new BigInteger("10000000000000000");
        BigInteger ONE = new BigInteger("1");
        BigInteger x1 = new BigInteger(String.valueOf(x));
        BigInteger p1 = new BigInteger(String.valueOf(p));

        int count = -1;

        while ( x1.compareTo(MAX) < 0) {
            count++;
            x1 = x1.multiply(p1).add(ONE);
        }
        System.out.println(count);
    }
}
