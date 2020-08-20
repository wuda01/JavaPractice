package othercode;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class offerFor {

    //offer_31
    public int NumberOf1Between1AndN_Solution(int n) {
        if (n==0) return 0;
        int count = 0;
        while (n>0) {
            String s = String.valueOf(n);
            char[] c = s.toCharArray();
            for (int i=0; i<c.length; i++) {
                if (c[i]=='1') count++;
            }
            n--;
        }
        return count;
    }

    //offer_32
    public String PrintMinNumber(int[] numbers) {
        if (numbers==null) return "";
        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                int num1 = Integer.parseInt(numbers[i]+""+numbers[j]);
                int num2 = Integer.parseInt(numbers[j]+""+numbers[i]);
                if (num1>num2) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        String result = "";
        for (int i=0; i<numbers.length; i++) {
            result = result+numbers[i];
        }
        return result;
    }

    //offer_33
    public int GetUglyNumber_Solution(int index) {
        if (index<7) return index;
        int k=0, m=0, n=0;
        int[] result = new int[index];
        result[0] = 1;
        for (int i=1; i<index; i++) {
            result[i] = Math.min(result[k]*2, Math.min(result[m]*3, result[n]*5));
            if (result[i]==result[k]*2) k++;
            if (result[i]==result[m]*3) m++;
            if (result[i]==result[n]*5) n++;
        }
        return result[index-1];
    }

    //offer_34
    public int newFirstNotRepeatingChar(String str) {
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

    //offer_35
    public int InversePairs(int [] array) {
        return 0;
    }


}
