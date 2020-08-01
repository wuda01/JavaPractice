package jobcode;

import java.util.Scanner;

public class Job0731_02 {

    /**
     *编程实现一个从字符串输入提取整数的程序，要求尽可能多的考虑异常输入的情况
     */

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
