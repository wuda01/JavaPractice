package jobcode;

import java.util.Arrays;
import java.util.Scanner;

public class Job073102 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().trim();
        str.replaceAll(" ", "");
        char[] chars = str.toCharArray();
        StringBuilder strb = new StringBuilder();
        boolean negativeUsed = false;
        for (char c: chars) {
            if (strb.length()==0 && c=='-' && !negativeUsed) {
                negativeUsed = true;
                strb.append(c);
            }
            if (c>='0' && c<='9') {
                strb.append(c);
            }
        }

        System.out.println(strb);
    }
}
