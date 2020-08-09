package offercode.Arrarys;

public class offer_67 {

    /**
     * 剪绳子
     * 题目描述
     * 给你一根长度为n的绳子，请把绳子剪成整数长的m段（m、n都是整数，n>1并且m>1，m<=n），
     * 每段绳子的长度记为k[1],...,k[m]。请问k[1]x...xk[m]可能的最大乘积是多少？
     * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
     * 输入描述:
     * 输入一个数n，意义见题面。（2 <= n <= 60）
     * 输出描述:
     * 输出答案。
     * 示例1
     * 输入
     * 复制
     * 8
     * 输出
     * 复制
     * 18
     */

    /**
     * 解题思路，找出最优解的规律
     * 当target等于1，2，3的时候，结果是固定的
     * 当target大于3的时候，可以看以下数据
     * target=4, 最优解：2 2
     * target=5, 最优解：3 2
     * target=6, 最优解：3 3
     * target=7, 最优解：3 2 2
     * target=8, 最优解：3 3 2
     * target=9, 最优解：3 3 3
     * target=10,最优解：3 3 2 2
     * target=11,最优解：3 3 3 2
     * target=12,最优解：3 3 3 3
     * target=13,最优解：3 3 3 2 2
     * target=14,最优解：3 3 3 3 2
     * target=15,最优解：3 3 3 3 3
     *
     * 所以不难发现3和2的个数规律
     */

    public static int cutRope(int target) {
        if (target==0) return 0;
        if (target==1 || target==2) return 1;
        if (target==3) return 2;
        int result, index;
        if (target%3==0) {
            index = target/3;
            result = (int) Math.pow(3, index);
        } else if (target%3==1) {
            index = target/3-1;
            result = (int) Math.pow(3, index)*4;
        } else {
            index = target/3;
            result = (int) Math.pow(3, index)*2;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(cutRope(0));
        System.out.println(cutRope(1));
        System.out.println(cutRope(2));
        System.out.println(cutRope(3));
        System.out.println(cutRope(8));
    }

    
}
