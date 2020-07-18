package offercode;

public class offer_10 {

    public static void main(String[] args) {

        System.out.println(NumberOf1(2));
        System.out.println(NumberOf1(5));
        System.out.println(NumberOf1(7));

    }

    public static int NumberOf1(int n) {
        int count = 0;
        while(n!=0){
            count++;
            n = n&(n-1);
        }
        return count;
    }
}
