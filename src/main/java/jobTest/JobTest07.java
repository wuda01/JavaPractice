package jobTest;

import java.util.*;

public class JobTest07 {

    public static boolean isValid(String s){
        int n = s.length();
        if (n%2==1){
            return false;
        }
        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};

        Deque<Character> stack = new LinkedList<Character>();
        for (int i=0; i<n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean index = isValid(s);
        if(index) System.out.println("True");
        else System.out.println("False");

    }

}
