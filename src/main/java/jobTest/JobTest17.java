package jobTest;

import java.util.Scanner;

public class JobTest17 {

    public static int calu(int a, int b, String flag){
        /*if (flag=="+") {
            return (a+b)%1000000007;
        }else if(flag=="-") {
            return (a-b)%1000000007;
        }else if(flag=="*") {
            return (a*b)%1000000007;
        }else{
            return ((int)Math.pow(a, b))%1000000007;
        }*/

        if (flag=="+") {
            return (a+b)%1000000007;
        }else if(flag=="-") {
            return (a-b)%1000000007;
        }else if(flag=="*") {
            return Math.floorMod((a*b), 1000000007);
        }else{
            return ((int)Math.pow(a, b))%1000000007;
        }
}


    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            String s = sc.nextLine();
            String[] ss = s.split(" ");
            System.out.println(calu(Integer.parseInt(ss[0]),
                    Integer.parseInt(ss[1]), ss[2]));

        }*/
        System.out.println(calu(1, 2, "+"));
        System.out.println(calu(3, 4, "-"));
        System.out.println(calu(1000000000, 1000000000, "*"));
        System.out.println(calu(2, 3, "^"));
        System.out.println(calu(2, 1000000000, "^"));
    }
}
