package jobTest;

public class JobTest18 {

    public static int func(int x){
        int countx = 0;
        while (x>0){
            countx++;
            x = x&(x-1);
        }
        return countx;
    }



    public static void main(String[] args) {
        /*int int1 = 1;
        int int2 = 1;
        Integer integer1 = new Integer(1);
        Integer integer2 = new Integer(1);
        Integer a1 = 127;
        Integer a2 = 127;
        Integer b1 = 128;
        Integer b2 = 128;

        System.out.println(int1==int2);
        System.out.println(integer1==integer2);
        System.out.println(a1==a2);
        System.out.println(b1==b2);*/

        /*Integer i = 50000;
        Integer k = 50000;
        System.out.println((i/1000==k/1000)+","+(i==k));*/
        //System.out.println(func(65530));

        String s1 = "ab";
        String s2 = "ab";
        double d1 = 1;
        double d2 = 1.0;
        String a = new String(s1);
        String b = new String(s2);

        System.out.println(s1==s2);
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(d1==d2);

    }


}
