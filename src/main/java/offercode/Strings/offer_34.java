package offercode.Strings;

import java.util.ArrayList;
import java.util.HashMap;

public class offer_34 {

    /**
     * 第一个只出现一次的字符串
     * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
     * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.（从0开始计数）
     */

    public static void main(String[] args) {
        String str = "abcndjfabcdjfafsdfgv";
        System.out.println(newFirstNotRepeatingChar("google"));
    }
    public static int FirstNotRepeatingChar(String str) {
        if (str==null || str.length()==0) return -1;
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int newFirstNotRepeatingChar(String str) {
        if (str.length()==0) return -1;
        char[] c = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<c.length; i++) {
            if (map.containsKey(c[i])) {
                map.put(c[i], map.get(c[i])+1);
            } else {
                map.put(c[i], 1);
            }
        }
        for (int i=0; i<c.length; i++) {
            if (map.get(c[i])==1)
                return i;
        }
        return -1;
    }
}
