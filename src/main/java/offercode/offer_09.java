package offercode;

public class offer_09 {

    public static void main(String[] args) {

        System.out.println(Fibonacci(3));

    }

    public static int Fibonacci(int n) {

        if(n==0) return 0;
        if(n==1) return 1;

        int sum = 1;
        int one = 0;
        for(int i=2; i<=n; i++){
            sum = sum+one;
            one = sum-one;
        }
        return sum;
    }
}
