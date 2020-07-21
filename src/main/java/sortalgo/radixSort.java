package sortalgo;

import java.util.ArrayList;
import java.util.Arrays;

public class radixSort {

    /**
     * 基数排序
     * 基数排序也是非比较的排序算法，对每一位进行排序，从最低位开始排序，
     * 复杂度为O(kn),为数组长度，k为数组中的数的最大的位数；基数排序是按照低位先排序，然后收集；
     * 再按照高位排序，然后再收集；依次类推，直到最高位。有时候有些属性是有优先级顺序的，
     * 先按低优先级排序，再按高优先级排序。最后的次序就是高优先级高的在前，高优先级相同的低优先级高的在前。
     * 基数排序基于分别排序，分别收集，所以是稳定的。
     * 10.1 算法描述
     * 取得数组中的最大数，并取得位数；
     * arr为原始数组，从最低位开始取每个位组成radix数组；
     * 对radix进行计数排序（利用计数排序适用于小范围数的特点）；
     * @param args
     */

    public static void main(String[] args) {
        int[] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        System.out.println(Arrays.toString(radix(arr)));

    }

    public static int[] radix(int[] arr){
        if(arr.length<1) return arr;

        int max = arr[0];
        for(int i=0; i<arr.length; i++) max=Math.max(max,arr[i]);

        int maxSize = 0;
        while(max != 0){
            max /= 10;
            maxSize++;
        }

        int mod=10,div=1;
        ArrayList<ArrayList<Integer>> buckArr = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<10; i++) buckArr.add(new ArrayList<Integer>());
        for(int i=0; i<maxSize; i++,mod*=10,div*=10){
            for(int j=0; j<arr.length; j++){
                int num = arr[j] % mod / div;
                buckArr.get(num).add(arr[j]);
            }

            int index = 0;
            for(int m=0; m<buckArr.size(); m++){
                for(int n=0; n<buckArr.get(m).size(); n++){
                    arr[index] = buckArr.get(m).get(n);
                    index++;
                }
                buckArr.get(m).clear();
            }
        }

        return arr;
    }
}
