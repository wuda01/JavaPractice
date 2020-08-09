package offercode.Strings;

import java.util.Arrays;

public class offer_44 {

    /**
     * 反转单词顺序列
     * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，
     * 写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，
     * 但却读不懂它的意思。例如，“student. a am I”。
     * 后来才意识到，这家伙原来把句子单词的顺序翻转了，
     * 正确的句子应该是“I am a student.”。
     * Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
     */

    public static String reverseWord(String s) {
        if (s==null || s.trim().length()==0) return s;
        String[] str = s.split(" ");
        String result = "";
        //System.out.println(Arrays.toString(str));
        for (int i=str.length-1; i>=0; i--) {
            result = result+str[i]+" ";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        String s = reverseWord("student. a am I");
        System.out.println(s);
    }
}
