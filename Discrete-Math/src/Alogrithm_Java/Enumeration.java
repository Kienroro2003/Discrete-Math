package Alogrithm_Java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Enumeration {
    public static int calFactorial(int num) {
        if (num == 1) return 1;
        else return num * calFactorial(--num);
    }

    public static void solve1(int n, int k, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int C = calFactorial(n) / (calFactorial(n - k) * calFactorial(k)) - 1;
        int total = 0;
        for (int ii = 0; ii < C; ii++) {
            int i;
            for (i = k; i > 0 && arr[i - 1] == n - k + i; i--) {
            }
            arr[i - 1] += 1;
            int j = i;
            for (; j < arr.length; j++) {
                arr[j] = arr[j - 1] + 1;
            }

            for (int jj = 0; jj < arr.length; jj++) {
                System.out.print(arr[jj] + " ");
            }
            System.out.println();
            total++;
        }

        System.out.println(total);
    }

    public static void solve2(int n, int k, int[] arr) {
        int i;
        do {
            for (i = 0; i < k; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            for (i = k; i > 0 && arr[i - 1] == n - k + i; i--) {
            }
            ;
            if (i > 0) {
                arr[i - 1] += 1;
                for (int j = i; j < k; j++) {
                    arr[j] = arr[j - 1] + 1;
                }
            }
        } while (i != 0);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void permutation(int n, int[] arr) {
        int i;
        do {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
            i = n - 1;
            for (; i > 0 && arr[i - 1] > arr[i]; i--) ;
            int a = i;
            if (i > 0) {
                int k = n - 1;
                int b = k;
                for (; arr[k] < arr[i - 1]; k--) ;
                swap(arr, i - 1, k);
                for (a = i; i < b; a++) {
                    swap(arr, a, b);
                    b--;
                }
            }
        } while (i != 0);
    }




    public static void main(String[] args) {
//        System.out.println(calFactorial(3));
//        int n = 9;
//        int k = 6;
//        int[] arr = {1,2,3,4,5,6};
//        solve1(n, k, arr);
    }
}
