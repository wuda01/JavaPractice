package othercode;

public class offerTwenty {

    //offer_11
    public int NumberOf1(int n) {
        int count = 0;
        while (n!=0) {
            count++;
            n = n&(n-1);
        }
        return count;
    }

    //offer_12
    public double Power(double base, int exponent) {
        double result = Math.pow(base, exponent);
        return result;
    }



}
