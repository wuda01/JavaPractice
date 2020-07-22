package offercode.Arrarys;

public class offer_08 {

    /**
     * 旋转数组的最小数字
     * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
     * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
     * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
     * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
     */

    public static void main(String[] args) {

        int[]arr = {3,4,5,1,2,3};
        System.out.println(minNumberInRotateArray(arr));


    }

    public static  int minNumberInRotateArray(int [] array) {
        //非递减序列
        if(array.length==0) return 0;
        int low = 0;
        int mid = 0;
        int high = array.length-1;

        while(low<high){
            if(array[low]<array[high]) return array[low];

            mid = (low+(high-low))/2;
            if(array[low]<array[mid]){
                low = mid;
            }else if(array[mid]<array[high]){
                high = mid;
            }else {
                low++;
            }

        }

        return array[low];
    }
}
