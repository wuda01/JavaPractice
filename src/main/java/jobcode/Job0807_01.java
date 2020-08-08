package jobcode;

import java.util.Stack;

public class Job0807_01 {


    public static String reverseParentheses(String s) {
        if(s == "") return "";
        String ret = "";
        Stack<Character> mystack = new Stack<>();
        String tmp = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                mystack.push(s.charAt(i));
            } else if(s.charAt(i) == ')') {
                tmp = "";
                while(true) {
                    char ch = mystack.peek();
                    mystack.pop();
                    if(ch == '(') {
                        if(mystack.empty()) {
                            ret += tmp;
                        } else {
                            for(int j = 0; j < tmp.length(); j++) {
                                mystack.push(tmp.charAt(j));
                            }
                        }
                        break;
                    } else {
                        tmp += ch;
                    }
                }
            } else {
                if(mystack.empty()) {
                    ret += s.charAt(i);
                } else
                    mystack.push(s.charAt(i));
            }
        }
        return ret;
    }

    public static void main(String[] args) {

        String s0 = "(u(love)i)";
        String s1 = "(ed(eb(oc))em)";
        String s2 = "a(bcdefghijkl(mno)p)q";

        String r = reverseParentheses(s2);
        System.out.println(r);
    }
}
