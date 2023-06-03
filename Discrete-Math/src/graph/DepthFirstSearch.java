package graph;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Stack;

public class DepthFirstSearch {
    public static boolean[][] matrix = new boolean[100][100];
    public static int[] trace = new int[100];
    public static int n;
    public static int m;
    public static int s;
    public static int f;
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

    public static void init() throws IOException {
        BufferedReader readFile = new BufferedReader(new FileReader("src/graph/data/PATH.INP"));
        String[] info = readFile.readLine().split(" ");
        n = Integer.parseInt(info[0]);
        m = Integer.parseInt(info[1]);
        s = Integer.parseInt(info[2]);
        f = Integer.parseInt(info[3]);
        String line = "";
        while ((line = readFile.readLine()) != null){
            int row = Integer.parseInt(line.split(" ")[0]);
            int col = Integer.parseInt(line.split(" ")[1]);
            matrix[row][col] = true;
            matrix[col][row] = true;
        }
        readFile.close();
    }

    public static void display(){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(matrix[i][j]){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void DFS(int u){
        for (int v = 1; v <= n; v++) {
            if(matrix[u][v] && trace[v] == 0){
                trace[v] = u;
                DFS(v);
            }
        }
    }

    public static void result(){
        for(int v = 1; v <= n; v++){
            if(trace[v] != 0){
                System.out.print(v + " ");
            }
        }
        System.out.println();
        if(trace[f] == 0){
            System.out.println("Not found");
        }else{
            while (f != s){
                System.out.print(f + "<-");
                f = trace[f];
            }
            System.out.println(trace[s]);
        }
    }

    public static void solve2() throws IOException {
        init();
        display();
        trace[s] = -1;
        DFS(s);
        result();
    }
    public static void solve1(){
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



    public static void main(String[] args) {
//        solve1();
        try {
            solve2();
        } catch (IOException e) {
            System.out.println("Khong tim thay file");
            throw new RuntimeException(e);
        }
        System.out.println("Without try catch");
    }
}
