package graph;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void display(int[][] matrix){
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean checkSimpleGraph(int[] arrDegree){
        int[] arr = arrDegree.clone();
        Arrays.sort(arr);
        reverseArray(arr);
        int countOdd = 0;
        int first = arr[0];
        if(first > arr.length - 1)return false;
        for (int i = 0; i < arr.length; i++) {
            if(isOdd(arrDegree[i])){
                countOdd++;
            }
        }
        if(isOdd(countOdd))return false;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int highest = arr[0];
            arr[0] = 0;

            for (int i = 1; i <= highest; i++) {
                arr[i] = arr[i] - 1;
                if(arr[i] == -1)return false;
                if(arr[i] == 0)end--;
            }
//            display(arr);
//            System.out.println();
            end--;
            Arrays.sort(arr);
            reverseArray(arr);
        }
        return true;
    }

    public static void constructGraph(int[] arrDegree) throws FileNotFoundException {
        boolean isSimpleGraph = checkSimpleGraph(arrDegree);
        if(isSimpleGraph){
            int n = arrDegree.length;
            int[][] matrix = new int[n][n];
            for(int i = 0 ; i < n; i++){
                for (int j = i + 1; j < n; j++) {
                    if (arrDegree[i] > 0 && arrDegree[j] > 0){
                        arrDegree[i] -= 1;
                        arrDegree[j] -= 1;
                        matrix[i][j] = 1;
                        matrix[j][i] = 1;
                    }
                }
            }
            display(matrix);
        }else{
            System.out.println("The array of degrees sequence is not a graph!");
        }


    }

    public static boolean isOdd(int number){
        return number % 2 == 1;
    }

    public static void reverseArray(int[] arr){
        int start  = 0;
        int end = arr.length - 1;
        while (start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/graph/data/MAIN.INP"));
        System.setOut(new PrintStream(new File("src/graph/data/MAIN.OUT")));
//        int[] arr = {3,3,1,1};
//        int[] arr = {6,5,5,4,3,3,3,2,2};
//        int[] arr = {3,3,2,2,1,1};
        int[] arr = {5,4,3,3,2,2,2,1,1,1};
//        System.out.println("Is a simple graph: " + checkSimpleGraph(arr));
        constructGraph(arr);
    }
}
