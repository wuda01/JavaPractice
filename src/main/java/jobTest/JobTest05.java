package jobTest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JobTest05 {

    public static String isPath(String path) {
        if (path==null) return "False";
        Set<Integer> vis = new HashSet<>();
        int x=0, y=0;
        vis.add(getHash(x, y));
        int length = path.length();
        for (int i=0; i<length; i++) {
            char dir = path.charAt(i);
            switch (dir) {
                case 'N': --x; break;
                case 'S': ++x; break;
                case 'W': --y; break;
                case 'E': ++y; break;
            }
            int hashValue = getHash(x, y);
            if (!vis.add(hashValue)) {
                return "True";
            }
        }
        return "False";
    }

    public static int getHash(int x, int y) {
        return x*20001+y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPath(s));
    }
}
