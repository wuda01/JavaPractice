package offercode.Numbers;

public class offer_11 {

    /**
     * 数值的整数次方
     * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
     * 保证base和exponent不同时为0
     */

    public static void main(String[] args) {

    }

    public double Power(double base, int exponent) {

        if(base==0.0) return 0.0;
        double result = 1.0;
        if(exponent<0){
            base = 1/base;
            exponent = -exponent;
        }
        for(int i=0; i<exponent; i++){
            result = base*result;
        }
        return result;
    }
}
