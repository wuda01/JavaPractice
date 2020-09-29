package Main;



public class Main05 {

    public static Interval match(int n, int k, String str1, String str2) {

        Interval interval = new Interval();
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        int match = 0;
        int min=0, max=0;
        for (int i=0; i<s1.length; i++) {
            if (s1[i]==s2[i]) match++;
        }
        if (match==0) {
            min = match;
        } else {
            min = match;
        }
        max = n-k+match;
        interval.start = min;
        interval.end = max;
        return interval;
    }

    public static void main(String[] args) {

        String s1 = "ABC";
        String s2 = "DDD";

        Interval ans = new Interval();
        ans = match(3, 1, s1, s2);
        System.out.println(ans.start+" "+ans.end);

    }
}
