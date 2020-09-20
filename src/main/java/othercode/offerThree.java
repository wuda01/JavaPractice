package othercode;

import com.google.gson.internal.$Gson$Preconditions;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class offerThree {

    //offer_31
    public int NumberOf1Between1AndN_Solution(int n) {
        if (n==0) return 0;
        int count = 0;
        while (n>0) {
            String s = String.valueOf(n);
            char[] c = s.toCharArray();
            for (int i=0; i<c.length; i++) {
                if (c[i]=='1') count++;
            }
            n--;
        }
        return count;
    }

    //offer_32
    public String PrintMinNumber(int[] numbers) {
        if (numbers==null) return "";
        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                int num1 = Integer.parseInt(numbers[i]+""+numbers[j]);
                int num2 = Integer.parseInt(numbers[j]+""+numbers[i]);
                if (num1>num2) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        String result = "";
        for (int i=0; i<numbers.length; i++) {
            result = result+numbers[i];
        }
        return result;
    }

    //offer_33
    public int GetUglyNumber_Solution(int index) {
        if (index<7) return index;
        int k=0, m=0, n=0;
        int[] result = new int[index];
        result[0] = 1;
        for (int i=1; i<index; i++) {
            result[i] = Math.min(result[k]*2, Math.min(result[m]*3, result[n]*5));
            if (result[i]==result[k]*2) k++;
            if (result[i]==result[m]*3) m++;
            if (result[i]==result[n]*5) n++;
        }
        return result[index-1];
    }

    //offer_34
    public int newFirstNotRepeatingChar(String str) {
        if (str.length()==0) return -1;
        char[] c = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<c.length; i++) {
            if (map.containsKey(c[i])) {
                map.put(c[i], map.get(c[i])+1);
            } else {
                map.put(c[i], 1);
            }
        }
        for (int i=0; i<c.length; i++) {
            if (map.get(c[i])==1)
                return i;
        }
        return -1;
    }

    //offer_35
    /*public int InversePairs(int[] array) {
        if (array.length<2) return 0;
        int count = 0;
        for (int i=0; i<array.length-1; i++) {
            for (int j=i+1; j<array.length; j++) {
                if (array[i]>array[j]) count++;
            }
        }
        return count;
    }*/
    public static int count=0;
    public int InversePairs(int[] array) {
        if (array.length<2) return 0;
        merge(array, 0, array.length-1);
        return count % 1000000007;
    }
    public static void merge(int[] arr, int left, int right) {
        if (left >= right) return;
        int mid = (left+right) / 2;
        merge(arr, left, mid);
        merge(arr, mid+1, right);
        mergeSort(arr, left, right, mid);
    }
    public static void mergeSort(int[] arr, int left, int right, int mid) {
        int[] assist = new int[right-left+1];
        int i=0, l1=left, r1=mid+1;
        while (l1<=mid && r1<=right) {
            if (arr[l1]>arr[r1]) {
                assist[i++] = arr[r1++];
                count+=mid-l1+1;
            } else {
                assist[i++] = arr[l1++];
            }
        }
        if (r1>right) {
            while (l1<=mid) assist[i++] = arr[l1++];
        }
        if (l1>mid) {
            while (r1<=right) assist[i++] = arr[r1++];
        }
        for (int j=0; j<assist.length; j++) {
            arr[left+j] = assist[j];
        }
    }

    //offer_36
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1==null || pHead2==null) return null;
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
            if (p1 != p2) { //两个链表长度一样
                if (p1 == null) p1 = pHead2;
                if (p2 == null) p2 = pHead1;
            }
        }
        return p1;
    }

    //offer_37
    public int GetNumberOfK(int [] array , int k) {
        int index = Arrays.binarySearch(array, k);
        if (index < 0) return 0;
        int result = 1;
        for (int i=index+1; i<array.length && array[i]==k; i++) {
            result++;
        }
        for (int i=index-1; i>=0 && array[i]==k; i--) {
            result++;
        }
        return result;
    }

    //offer_38
    public int TreeDepth(TreeNode root) {
        if (root==null) return 0;
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        int result = Math.max(left, right) + 1;
        return result;
    }

    //offer_39
    public boolean IsBalanced_Solution(TreeNode root) {
        return depth(root) != -1;
    }
    public int depth(TreeNode root) {
        if (root==null) return 0;
        int left = depth(root.left);
        if (left==-1) return -1;
        int right = depth(root.right);
        if (right==-1) return -1;
        if (left-right<(-1) || left-right>1) {
            return -1;
        } else {
            return 1+(left>right?left:right);
        }
    }

    //offer_40
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array.length<2) return;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<array.length; i++) {
            if (list.contains(array[i])) {
                list.remove(new Integer(array[i]));
            } else {
                list.add(array[i]);
            }
        }
        num1[0] = list.get(0);
        num2[0] = list.get(1);
        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }


}
