package jobTest;

import java.util.ArrayList;
import java.util.Stack;

public class JobTest03 {

    public static void Do(String s) {

        Stack<String> sta = new Stack<>();
        Stack<String> stb = new Stack<>();
        String[] arr = s.split(" |\t");
        for (int i=0; i<arr.length; i++) {
            if (arr[i].equals("undo")) {
                sta.push(stb.pop());
            } else if (arr[i].equals("redo")) {
                stb.push(sta.pop());
            } else {
                stb.push(arr[i]);
            }
        }
        ArrayList<String> tem = new ArrayList<>();
        while (!stb.isEmpty()) {
            tem.add(stb.pop());
        }
        String res = "";
        for (int i=tem.size()-1; i>=0; i--) {
            res = res+tem.get(i)+" ";
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        /*Integer i01 = -128;
        int i02 = -128;
        Integer i03 = Integer.valueOf(-128);
        Integer i04 = new Integer(-128);

        System.out.println(i03==i04);*/

        String s = "hello undo redo word";
        Do(s);
    }

}
