package offercode.Arrarys;

import java.util.ArrayList;

public class offer_41 {

    /**
     * 和为s的连续正数序列
     * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
     * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
     * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。现
     * 在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
     */


    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i=1; i<sum; i++) {
            int index = 0;
            int j = i;
            ArrayList<Integer> list = new ArrayList<>();
            while (j<sum) {
                index+=j;
                list.add(j);
                j++;
                if (index==sum) {
                    //System.out.println(list);
                    result.add(list);
                    //System.out.println(result);
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(FindContinuousSequence(100));


        /*ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        result.add(list);

        list.clear();

        list.add(10);
        list.add(20);
        list.add(30);

        result.add(list);

        System.out.println(result);*/
    }
}
