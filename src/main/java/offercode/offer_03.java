package offercode;

public class offer_03 {

    public static void main(String[] args) {

        int [][] arr = new int[][]{
                {1,2,8,9},
                {2,4,9,12},
                {4,7,10,13},
                {6,8,11,15}
        };

        System.out.println(Find(16,arr));

    }

    public static boolean Find(int target, int [][] array) {

        int rows = array.length;
        if(rows==0) return false;

        int cols = array[0].length;
        if(cols==0) return false;

        int row = rows-1;
        int col = 0;
        while(row>=0 && col<cols){
            if(target < array[row][col]){
                row--;
            }else if(target > array[row][col]){
                col++;
            }else {
                return true;
            }
        }
        return false;
    }
}
