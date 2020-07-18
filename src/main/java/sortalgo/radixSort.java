package sortalgo;

import java.util.ArrayList;
import java.util.Arrays;

public class radixSort {

    public static void main(String[] args) {
        int[] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        System.out.println(Arrays.toString(radix(arr)));

    }

    public static int[] radix(int[] arr){
        if(arr.length<1) return arr;

        int max = arr[0];
        for(int i=0; i<arr.length; i++) max=Math.max(max,arr[i]);

        int maxSize = 0;
        while(max != 0){
            max /= 10;
            maxSize++;
        }

        int mod=10,div=1;
        ArrayList<ArrayList<Integer>> buckArr = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<10; i++) buckArr.add(new ArrayList<Integer>());
        for(int i=0; i<maxSize; i++,mod*=10,div*=10){
            for(int j=0; j<arr.length; j++){
                int num = arr[j] % mod / div;
                buckArr.get(num).add(arr[j]);
            }

            int index = 0;
            for(int m=0; m<buckArr.size(); m++){
                for(int n=0; n<buckArr.get(m).size(); n++){
                    arr[index] = buckArr.get(m).get(n);
                    index++;
                }
                buckArr.get(m).clear();
            }
        }

        return arr;
    }
}
