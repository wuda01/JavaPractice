package offercode.BinaryTrees;

import java.util.Arrays;

public class offer_23 {

    /**
     * 二叉搜索树的后续遍历数列
     * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
     * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
     */

    /**
     * 对于每一棵子树，它的根结点总是对应该子树的后序序列的最后一个数
     * 那么，只需要不断地确定出左子树区间和右子树区间，并且判断：
     * 左子树区间的所有结点值 < 根结点值 < 右子树区间所有结点值，这个条件是否满足即可
     * @param args
     */

    public static void main(String[] args) {

        int[] arr = {4,8,6,12,16,14,10};
        int[] a = {5,4,3,2,1};
        System.out.println(VerifySquenceOfBST(arr));
        System.out.println(newVerifySquenceOfBST(arr));

    }

    public static boolean VerifySquenceOfBST(int[] sequence) {
        int len = sequence.length;
        if(sequence==null || len==0) return false;

        int root = sequence[len-1];
        int i = 0;
        for(; i<len-1; i++){
            if(sequence[i]>root) break;
        }
        int j = i;
        for(; j<len-1; j++){
            if(sequence[j]<root) return false;
        }
        System.out.print(i+" ");
        boolean left=true, right=true;
        if(i>0) left = VerifySquenceOfBST(Arrays.copyOfRange(sequence,0,i));
        if(i<len-1) right = VerifySquenceOfBST(Arrays.copyOfRange(sequence,i,len-1));
        return left && right;
    }

    public static boolean newVerifySquenceOfBST(int[] sequence) {
        int len = sequence.length;
        if (sequence==null || len==0) return false;
        int root = sequence[len-1];
        int i = len-1;
        for (; i>=0; i--) {
            if (sequence[i]<root) break;
        }
        int j = i;
        for (; j>=0; j--) {
            if (sequence[j]>root) return false;
        }
        System.out.print(i+" ");
        boolean left=true, right=true;
        if (i>=0) left = newVerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, i+1));
        if (i<len-2) right = newVerifySquenceOfBST(Arrays.copyOfRange(sequence, i+1, len-1));
        return left && right;
    }

}
