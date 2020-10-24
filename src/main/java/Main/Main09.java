package Main;

import java.util.Scanner;

public class Main09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*int n = sc.nextInt();
        String[] ss = sc.nextLine().split(" ");
        String[] as = new String[n-1];
        for (int i=0; i<n-1; i++) {
            as[i] = sc.nextLine();
        }*/
        String s = sc.nextLine();
        System.out.println(s.substring(1,3));

    }
}
