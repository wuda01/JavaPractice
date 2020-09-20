package jobTest;

public class JobTest17 {

    public static int score;

    public static void getScore(int[][] gird, char[] arr, int[][] flag) {
        int rows=6, cols=6;
        int row, col;
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (gird[i][j]=='S'){
                    row = i;
                    col = j;
                }
            }
        }
        
    }


    public static void main(String[] args) {

        int[][] gird = {{'S','#','+','+','O','#'},
                        {'O','X','X','#','X','#'},
                        {'+','+','+','+','+','+'},
                        {'#','#','#','X','X','#'},
                        {'+','+','#','O','#','+'},
                        {'O','X','O','+','+','X'}};
        String path = "SSDDDDDAWWSSSAWSSSADDD";
        int[][] flag = new int[6][6];
        char[] arr = path.toCharArray();
        getScore(gird, arr, flag);
    }
}
