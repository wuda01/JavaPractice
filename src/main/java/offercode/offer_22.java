package offercode;

import java.util.Stack;

public class offer_22 {

    public static void main(String[] args) {

        int[] pushA = {1,2,3,4,5};
        int[] popA = {4,3,5,1,2};
        System.out.println(IsPopOrder(pushA,popA));

    }

    public static boolean IsPopOrder(int [] pushA,int [] popA) {

        if(popA.length==0 || pushA.length==0) return false;

        Stack<Integer> aux = new Stack<Integer>();
        int index = 0;
        for(int i=0; i<pushA.length; i++){
            aux.push(pushA[i]);
            while (!aux.empty() && aux.peek()==popA[index]){
                aux.pop();
                index++;
            }
        }
        return aux.empty();
    }
}
