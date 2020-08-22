package jobTest;


import java.util.*;

public class JobTest04{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(",");
        int[] nums = new int[s.length];
        for (int i=0; i<s.length; i++) {
            nums[i] = Integer.parseInt(s[i]);
        }
        find(nums);

    }

    public static void find(int[] nums) {
        String result = "";
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(nums[i])) {
                //map.put(nums[i], map.get(nums[i])+1);
                //System.out.print(nums[i]+" ");
                result = result+nums[i]+" ";
            } else {
                map.put(nums[i], 1);
            }
        }
        System.out.println(result);
    }


    /*public static List<Integer> find(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            int index = Math.abs(nums[i]-1);
            if (nums[index] < 0) {
                result.add(Math.abs(index+1));
            }
            nums[index] = -nums[index];
        }
        return result;
    }*/
}