package graph;

import java.util.Arrays;

public class AdjacencyMatrix {

    public static int[][] createAdjacencyMatrix(int[] degrees) {
        int n = degrees.length;
        int[][] adjacencyMatrix = new int[n][n];

        // Sort the degrees in descending order
        Arrays.sort(degrees);
        reverseArray(degrees);

        // Iterate through each vertex
        for (int i = 0; i < n; i++) {
            int degree = degrees[i];

            // Check if the degree is valid
            if (degree >= n - 1) {
                return null; // Invalid degree sequence
            }

            // Connect the vertex to its adjacent vertices
            for (int j = 0; j < degree; j++) {
                if (degrees[j] <= 0) {
                    return null; // Invalid degree sequence
                }
                adjacencyMatrix[i][j] = 1;
                adjacencyMatrix[j][i] = 1;
                degrees[j]--;
            }
        }

        return adjacencyMatrix;
    }

    private static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] degrees = {3,3,2,2,1,1};

        int[][] adjacencyMatrix = createAdjacencyMatrix(degrees);
        if (adjacencyMatrix == null) {
            System.out.println("Invalid degree sequence.");
        } else {
            System.out.println("Adjacency Matrix:");
            for (int[] row : adjacencyMatrix) {
                System.out.println(Arrays.toString(row));
            }
        }
    }
}
