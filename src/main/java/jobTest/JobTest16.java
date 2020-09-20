package jobTest;

import java.util.*;
public class JobTest16{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String string=sc.nextLine();
        char[] A=string.toCharArray();
        Map<Character,Integer> m=new LinkedHashMap<Character,Integer>();
        for(char c:A){
            if(!m.containsKey(c)){
                m.put(c,1);
            }else{
                m.put(c,m.get(c)+1);
            }
        }
        Collection<Integer> al=m.values();
        int index=Collections.min(al);
        StringBuffer sb=new StringBuffer("");
        for(char c:A){
            if(m.get(c)!=index)
                sb.append(c);
        }
        System.out.print(sb.toString());
    }
}
