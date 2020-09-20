package jobTest;

import java.util.ArrayList;
import java.util.Scanner;

public class JobTest08 {

    public static boolean reverse(String s) {
        int i=0, j=s.length()-1;
        while (i<j && s.charAt(i)==s.charAt(j)){
            i = i+1;
            j = j-1;
        }
        return i>=j;
    }

    public static void include(String s) {


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String>  list = new ArrayList<>();
        while (sc.hasNext()){
           String s = sc.nextLine();
           list.add(s);
        }
        for (int i=0; i<list.size(); i++) {
            boolean flag = reverse(list.get(i));
            if (flag) System.out.println("YES");
            else System.out.println("NO");
        }


    }
}
