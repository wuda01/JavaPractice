package Main;

import java.util.*;

public class Main06 {

    public static int graph_circle_checker(String graph_string) {
        try {
            int len = graph_string.length() - 1;
            String s = graph_string.substring(1, len);
            String[] ss = s.split(",");
            char[][] edges = new char[ss.length][2];
            for (int i=0; i<ss.length; i++) {
                edges[i][0] = ss[i].charAt(1);
                edges[i][1] = ss[i].charAt(4);
            }
            Map<Character, List<Character>> graph = new HashMap<>();
            for (char[] edge : edges) {
                char u = edge[0];
                char v = edge[1];
                boolean hasPath = dfs(graph, u, v, new ArrayList<Character>());
                if (hasPath == true) {
                    return 1;
                } else {
                    if (!graph.containsKey(u)) graph.put(u, new ArrayList<Character>());
                    graph.get(u).add(v);
                    if (!graph.containsKey(v)) graph.put(v, new ArrayList<Character>());
                    graph.get(v).add(u);
                }
            }
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

    public static boolean dfs(Map<Character, List<Character>> graph, char start, char end, List<Character> visited) {
        if(!graph.containsKey(start) || !graph.containsKey(end)) return false;
        if(start == end) return true;
        visited.add(start);
        for(char adj : graph.get(start)) {
            if(!visited.contains(adj)) {
                if(dfs(graph, adj, end, visited) == true) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String str = "{(A->B),(B->C),(C->A)}";
        System.out.println(graph_circle_checker(str));

    }

}
