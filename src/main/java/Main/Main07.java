package Main;

import java.util.Arrays;
import java.util.Comparator;

public class Main07 {

    public static int twoCitySchedCost(int[][] costs) {
        int res = 0;
        int[] temp = new int[costs.length];

        for (int i=0; i<costs.length; i++) {
            temp[i] = costs[i][1] - costs[i][0];
            res += costs[i][0];
        }
        Arrays.sort(temp);
        for (int i=0; i<temp.length/2; i++) {
            res += temp[i];
        }
        return res;

    }

    public static void main(String[] args) {
        int[][] costs = {{10,30},{100,200},{150,50},{60,20}};
        System.out.println(twoCitySchedCost(costs));
    }

}
