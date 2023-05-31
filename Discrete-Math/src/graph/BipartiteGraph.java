package graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraph {
    public static boolean isBipartite(int[][] G){
        int[] colorArr = new int[G[0].length];
        Arrays.fill(colorArr, -1);
        for (int i = 0; i < colorArr.length; i++) {
            if(colorArr[i] == -1){
                if(!isBipartiteUtil(G, i, colorArr)){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isBipartiteUtil(int[][] G, int src, int[] colorArr) {
        colorArr[src] = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);
        while(!queue.isEmpty()){
            int u = queue.poll();
            if(G[u][u] == 1)return false;
            for(int v = 0 ; v < G[0].length; v++){
                if(G[u][v] == 1 && colorArr[v] == -1){
                    colorArr[v] = 1 - colorArr[u];
                    queue.add(v);
                }else if (G[u][v] == 1 && colorArr[v] == colorArr[u]){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isBipartite(int[][] G, int source){
        int[] colorArr = new int[G[0].length];
        Arrays.fill(colorArr, -1);
        colorArr[source] = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        while(!queue.isEmpty()){
            int u = queue.peek();
            queue.poll();
            if(G[u][u] == 1)return false;
            for(int i = 0 ; i < G[0].length; i++){
                if(G[u][i] == 1 && colorArr[i] == -1){
                    colorArr[i] = 1 - colorArr[u];
                    queue.add(i);
                }else if (G[u][i] == 1 && colorArr[i] == colorArr[u]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] graph = {
                {0,1,0,1},
                {1,0,1,0},
                {0,1,0,1},
                {1,0,1,0}
        };
        System.out.println("Is bipartite graph: " + isBipartite(graph));
    }
}
