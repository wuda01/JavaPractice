package jobTest;

import java.util.Scanner;

public class JobTest08 {


    public static void dfs(char[][] grid, int r, int c) {
        int nr = grid.length;
        int nc = grid[0].length;
        if (r<0 || c<0 || r>=nr || c>=nc || grid[r][c]=='S') return;
        grid[r][c] = 'S';
        dfs(grid, r-1, c);
        dfs(grid, r+1, c);
        dfs(grid, r, c-1);
        dfs(grid, r, c+1);
    }

    public static int numlslands(char[][] grid) {
        if (grid==null || grid.length==0) return 0;
        int nr = grid.length; //行数
        int nc = grid[0].length; //列数
        int num_islands = 0;
        for (int r=0; r<nr; ++r) {
            for (int c=0; c<nc; ++c) {
                if (grid[r][c]=='H') {
                    num_islands++;
                    dfs(grid, r, c);
                }
            }
        }
        return num_islands;
    }

    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        String[] num = sc.nextLine().split(",");
        int rows = Integer.parseInt(num[0]);
        int cols = Integer.parseInt(num[1]);
        char[][] grid = new char[rows][cols];
        for (int i=0; i<rows; i++) {
            String tmp = sc.nextLine();
            //System.out.println("==> "+tmp);
            char[] c = tmp.toCharArray();
            for (int j=0; j<cols; j++) {
                grid[i][j] = c[j];
            }
        }*/
        char[][] test = {{'S','S','H','H','H'},
                         {'S','S','H','H','H'},
                         {'H','H','S','H','H'},
                         {'H','H','H','S','S'}};
        System.out.println(numlslands(test));

    }
}
