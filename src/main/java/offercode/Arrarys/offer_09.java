package offercode.Arrarys;

public class offer_09 {

    /**
     * 变态跳台阶
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
     * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
     */

    /**
     * f[n] = f[n-1] + f[n-2] + ... + f[0] = 2*f[n-1] = 2*2*f[n-2] = 2*2*2f[n-3] = 2**(n-1)f[1]
     * f[n-1] = f[n-2] + ... + f[0] = 2*f[n-2]
     * f[n-2] = f[n-3] + ... + f[0] = 2*f[n-3]
     * f[n-3] = f[n-4] + ... + f[0] = 2*f[n-4]
     * @param target
     * @return
     */

    public static int JumpFloorII(int target) {
        if (target==0 || target==1) return target;
        int result = (int) Math.pow(2, target-1);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(JumpFloorII(10)); //2
        System.out.println(JumpFloorII(3)); //4
    }
}
