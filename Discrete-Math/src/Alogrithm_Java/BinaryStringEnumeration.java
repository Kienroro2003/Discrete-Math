package Alogrithm_Java;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class BinaryStringEnumeration {
    public static void solve(int n){
        int[] arr = new int[n];
        Arrays.fill(arr, 0);
        int cur;
        do{
            for(int i = 0 ; i < n; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            for(cur = n - 1; cur >= 0 && arr[cur] == 1; cur--);
            if(cur >= 0){
                arr[cur] = 1;
                for(cur += 1; cur < n; cur++){
                    arr[cur] = 0;
                }
            }
        }while (cur >= 0);
    }
    public static void main(String[] args) throws IOException {
        solve(8);
    }
}