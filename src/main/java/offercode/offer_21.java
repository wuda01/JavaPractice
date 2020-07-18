package offercode;

import java.util.Stack;

public class offer_21 {

    public static void main(String[] args) {

    }

    Stack<Integer> stackTotal = new Stack<Integer>();
    Stack<Integer> stackLitte = new Stack<Integer>();

    public void push(int node) {
        stackTotal.push(node);
        if(stackLitte.empty()){
            stackLitte.push(node);
        }else if(node<=stackLitte.peek()){
            stackLitte.push(node);
        }else{
            stackLitte.push(stackLitte.peek());
        }

    }

    public void pop() {
        stackTotal.pop();
        stackLitte.pop();
    }

    public int top() {
        return stackTotal.peek();
    }

    public int min() {
        return stackLitte.peek();
    }
}
