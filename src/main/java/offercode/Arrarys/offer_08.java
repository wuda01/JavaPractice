package offercode.Arrarys;

public class offer_08 {

    /**
     * 跳台阶
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
     * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）
     */

    /**
     * 由于它可以跳1级台阶或者2级台阶，所以它上一步必定在第n-1,或者第n-2级台阶，
     * 也就是说它跳上n级台阶的跳法数是跳上n-1和跳上n-2级台阶的跳法数之和。
     * @param target
     * @return
     */

    public static int JumpFloor(int target) {
        if (target==0 || target==1) return target;
        int a=1, b=1, r=0;
        for (int i=2; i<=target; i++) {
            r = a+b;
            a = b; //n-2阶台阶
            b = r; //n-1阶台阶
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(JumpFloor(10));
    }
}
