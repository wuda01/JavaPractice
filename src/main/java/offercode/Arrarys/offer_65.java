package offercode.Arrarys;

public class offer_65 {

    /**
     * 矩阵中的路径
     * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
     * 路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
     * 如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
     * 例如
     *
     * a b c e
     * s f c s
     * a d e e
     *
     * 矩阵中包含一条字符串"bcced"的路径，但是矩阵中不包含"abcb"路径，
     * 因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
     */

    /**
     * dfs(){
     *     // 第一步，检查下标是否满足条件
     *     // 第二步：检查是否被访问过，或者是否满足当前匹配条件
     *     // 第三步：检查是否满足返回结果条件
     *     // 第四步：都没有返回，说明应该进行下一步递归
     *     // 标记
     *     dfs(下一次)
     *     // 回溯
     * }
     *
     * main() {
     *     for (对所有可能情况) {
     *         dfs()
     *     }
     * }
     */

    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        int[] flag = new int[rows*cols];
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (help(matrix, rows, cols, str, 0, flag, i, j))
                    return true;
            }
        }
        return false;
    }

    public static boolean help(char[] matrix, int rows, int cols, char[] str,
                               int cur, int[] flag, int r, int c) {
        //rows 行数
        //cols 列数
        //int row, int col表明当前的坐标的行列值
        //flag表明那些曾经在路径中出现过的节点的坐标
        //cur表示当前需要匹配的字符的位置，是下一个待访问的节点，不需关系其有效性，因为最后一个元素是‘0’
        int index = cols*r+c; //字符位置
        if (r>=0 && r<rows && c>=0 && c<cols && flag[index]==0) {
            if (matrix[index] == str[cur]) {
                cur = cur+1; //需要匹配的下一个字符
                if (cur >= str.length) return true;
                flag[index] = 1; //标记一下已经判断过的位置
                if (help(matrix, rows, cols, str, cur, flag, r-1, c) ||
                    help(matrix, rows, cols, str, cur, flag, r+1, c) ||
                    help(matrix, rows, cols, str, cur, flag, r, c-1) ||
                    help(matrix, rows, cols, str, cur, flag, r, c+1))
                    return true;
                flag[index] = 0;
                return false;
            }
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        char[] c = {'a','b','c','e','s','f','c','s','a','d','e','e'};
        char[] t1 = {'b','c','c','e','d'};
        char[] t2 = {'a','b','c','b'};

        //true
        System.out.println(hasPath(c, 3, 4, t1));
        //false
        System.out.println(hasPath(c, 3, 4, t2));

    }
}
