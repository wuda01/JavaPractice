package jobTest;

public class JobTest25 {

    String str = new String("good");
    char[] ch = {'a', 'b', 'c'};

    public static void main(String[] args) {
        /*int x;
        int y;
        for (x=1, y=1; x<=100; x++) {
            if (y>=20){
                break;
            }
            if (y%3==1){
                y += 3;
                continue;
            }
            y -= 5;
        }
        System.out.println("x="+x+",y="+y);*/

        /*double a = 0;
        double b = 99;
        while (true){
            double c = (a+b)/2;
            if (c==a || c==b) break;
            a = b;
            b = c;
        }
        System.out.println(a);*/

        /*JobTest25 ex = new JobTest25();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str+" and");
        System.out.println(ex.ch);*/

        int n = 310;
        System.out.println(n/100);
        System.out.println(n/10%10);
        System.out.println(n-n/100*100-n/10%10*10);

        //865 --> 267552
        System.out.println(calSum(865));

    }

    public static int calSum(int number){
        int sum = 0;
        for (int i=101; i<number; i++) {
            int a = i/100;
            int b = i/10%10;
            int c = i-1*100-b*10;
            if (c!=7 || b!=5 || a!=3) {
                sum += i;
            }
        }
        return sum;
    }

    public void change(String str, char[] ch) {
        str = "test ok";
        ch = new char[]{'g'};
    }
}
