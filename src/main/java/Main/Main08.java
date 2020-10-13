package Main;

import java.util.Scanner;

public class Main08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = Integer.parseInt(sc.nextLine());
        boolean flag = false;
        for (int i = 0; i < lines; i++) {
            String s = sc.nextLine();
            int num = s.indexOf("=");
            if (num != -1) {
                String[] ss = s.split("\\[");
                if (ss.length > 2) flag = true;
            }
            if (flag) {
                System.out.println(i + 1);
                break;
            }
        }
        if (!flag) System.out.println(0);
    }
}
