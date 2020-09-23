package jobTest;

public class JobTest26 {

    static int x = 10;

    public static void main(String[] args) {

        int a = 0;
        while (a<5){
            switch (a) {
                case 0:;
                case 3:a = a+2;
                case 1:;
                case 2:a = a+3;
                default:a = a+5;
            }
        }
        //System.out.println(a);

        //System.out.println("x=" + x);

        int i = 0;
        inc(i);
        i = i++;
        //System.out.println(i);

        Thread thread = new Thread(){
            @Override
            public void run(){
                test2();
            }
        };
        thread.run();
        System.out.println("A");

    }

    static void test2(){
        System.out.println("B");
    }

    static void inc(int i){
        i++;
    }

    static {
        x += 5;
    }

    static {
        x /= 3;
    }
}
