package graph;

import java.util.Arrays;
import java.util.Stack;

public class DepthFirstSearch {
    public static void DFS(int[][] matrix, int firstVertex){
        int n = matrix.length;
        int[] vertices = new int[n];
        Arrays.fill(vertices, 0);
        Stack<Integer> stack = new Stack<>();
        stack.push(firstVertex);
        while (!stack.isEmpty()){
            int vertex = stack.pop();
            if(vertices[vertex - 1] == 0){
                System.out.print(vertex + " ");
                vertices[vertex - 1] = 1;
            }
            for (int i = 0; i < n; i++) {
                if(matrix[vertex - 1][n - 1 - i] == 1 && vertices[n - 1 - i] == 0){
                    stack.push(n - i);
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
        DFS(matrix, 3);
    }
}
