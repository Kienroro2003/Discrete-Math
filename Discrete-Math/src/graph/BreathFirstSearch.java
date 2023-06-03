package graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BreathFirstSearch {

    public static void BFS(int[][] matrix, int v){
        int n = matrix.length;
        int[] vertices = new int[n];
        Arrays.fill(vertices, -1);
//        vertices[v-1] = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        while (!queue.isEmpty()){
            int vertex = queue.poll();
            if(vertices[vertex - 1] == -1){
                System.out.print(vertex + " ");
                vertices[vertex - 1] = 1;
            }
            for (int i = 0; i < n; i++) {
                if(matrix[vertex - 1][i] == 1 && vertices[i] == -1){
                    queue.add(i + 1);
                }
            }
        }
    }


    public static void main(String[] args) {
        int[][] matrix = {
                {0,1,1,0,0,1,1,0,0,0,0},
                {1,0,1,1,1,0,0,0,0,0,0},
                {1,1,0,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,0,1,0},
                {0,1,0,1,0,0,0,0,0,0,0},
                {1,0,0,1,0,0,1,0,0,1,0},
                {1,0,0,0,0,1,0,1,1,0,0},
                {0,0,0,0,0,0,1,0,1,1,1},
                {0,0,0,0,0,0,1,1,0,0,0},
                {0,0,0,1,0,1,0,1,0,0,1},
                {0,0,0,0,0,0,0,1,0,1,0}
        };
        BFS(matrix, 10);
    }
}
