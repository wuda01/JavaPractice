package offercode.Arrarys;

public class offer_66 {

    /**
     * 机器人运动范围
     * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
     * 但是不能进入行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，机器人能够进入方格（35,37），
     * 因为3+5+3+7 = 18。但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
     */


    // 判断坐标是否符合要求
    public static boolean isValid(int row, int col, int threshold){
        int sum = 0;
        //判断行列值是否满足要求
        while(row > 0){
            sum += row%10;
            row = row/10;
        }
        while(col > 0){
            sum += col%10;
            col = col/10;
        }
        if(sum > threshold) return false;
        else return true;
    }
    //统计能够走到的次数
    public static int count = 0;

    public static void help(int i, int j, int threshold, int rows, int cols, int[][] flag){
        if (i<0 || i>=rows || j<0 || j>=cols) return;//如果坐标不符合则不计数
        if (flag[i][j] == 1) return; //如果曾经被访问过则不计数
        if (!isValid(i, j, threshold)){
            flag[i][j] = 1; //如果不满足坐标有效性，则不计数并且标记是访问的
            return;
        }
        flag[i][j] = 1;
        count++;
        //遍历上下左右节点
        //向上
        help(i-1, j, threshold, rows, cols, flag);
        //向下
        help(i+1, j, threshold, rows, cols, flag);
        //向左
        help(i, j-1, threshold, rows, cols, flag);
        //向右
        help(i, j+1, threshold, rows, cols, flag);
    }


    public static int movingCount(int threshold, int rows, int cols)
    {
        int[][] flag = new int[rows][cols];
        help(0, 0, threshold, rows, cols, flag);
        return count;
    }

    public static void main(String[] args) {
        //5,10,10 --> 21
        //15,20,20 --> 359
        System.out.println(movingCount(15, 20, 20));
    }
}
