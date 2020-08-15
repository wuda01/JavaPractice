package othercode;

import java.util.ArrayList;

public class offerSix {

    //offer_64
    public ArrayList<Integer> maxInWindows(int [] num, int size){
        ArrayList<Integer> list = new ArrayList<>();
        if (num.length<size || size<1) return list;
        for (int i=0; i<num.length-size+1; i++) {
            int max = num[i];
            for (int j=i+1; j<i+size; j++) {
                max = Math.max(max, num[j]);
            }
            list.add(max);
        }
        return list;
    }


}
