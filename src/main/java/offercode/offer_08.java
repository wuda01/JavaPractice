package offercode;

public class offer_08 {

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
