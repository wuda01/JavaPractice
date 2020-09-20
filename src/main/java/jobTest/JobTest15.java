package jobTest;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JobTest15 {

    public static int recursion(int num) {
        int sum = 1;
        if (num==1) {
            return 1;
        } else {
            sum = num*recursion(num-1);
            return sum;
        }
    }

    public static void number(int n) {
        int count = 0;
        while (n!=0) {
            int tem = n%10;
            if (tem==0) count++;
            else break;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = Integer.parseInt(s);
        int num = recursion(n);
        number(num);
    }
}
