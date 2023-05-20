package Alogrithm_Java;

public class CombinationEnumeration {
    public static void backtracking1(int n, int index, int[] arr) {
        for (int i = 0; i <= n; i++) {
            arr[index] = i;
            if (index == arr.length - 1) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j] + " ");

                }
                System.out.println();
            } else backtracking1(n, index + 1, arr);
        }
    }

    public static void backtracking2(int[] arr, int n, int k, int index) {
        for (int i = arr[index - 1] + 1; i < n - k + 1 + index; i++) {
            arr[index] = i;
            if (index == k) {
                for (int j = 1; j < arr.length; j++) {
                    System.out.print(arr[j] + " ");

                }
                System.out.println();
            } else backtracking2(arr, n, k, index + 1);
        }
    }

    public static void main(String[] args) {

//        backtracking1(1, 0, new int[5]);
        backtracking2(new int[4], 6, 3, 1);
    }
}
