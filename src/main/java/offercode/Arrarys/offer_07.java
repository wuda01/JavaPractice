package offercode.Arrarys;

public class offer_07 {

    /**
     * 斐波那契数列
     * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项
     * （从0开始，第0项为0，第1项是1）。
     * n<=39
     */

    /**
     * F[n]=F[n-1]+F[n-2](n>=3,F[1]=1,F[2]=1)
     */

    public static void main(String[] args) {

        System.out.println(Fibonacci(3));

    }

    public static int Fibonacci(int n) {

        /*if(n==0) return 0;
        if(n==1) return 1;
        int sum = 1;
        int one = 0;
        for(int i=2; i<=n; i++){
            sum = sum+one;
            one = sum-one;
        }
        return sum;*/

        if (n==0 || n==1) return n;
        return Fibonacci(n-1) + Fibonacci(n-2);

    }

}
