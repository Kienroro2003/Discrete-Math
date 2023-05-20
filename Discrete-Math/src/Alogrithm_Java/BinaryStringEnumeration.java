package Alogrithm_Java;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class BinaryStringEnumeration {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/data/BSTR.INP"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/data/BSTR.OUT"));
        int n =  Integer.parseInt(bufferedReader.readLine().trim());
        int[] arr = new int[n];
        int i = 0;
        do{
            for (i = 0; i < n; i++) {
                bufferedWriter.write(arr[i] + " ");
            }
            bufferedWriter.newLine();
            for (i = n - 1; i >= 0 && arr[i] == 1  ; i--) {
            }
            if(i < 0)break;
            arr[i++] = 1;
            for (; i < n ; i++) {
                arr[i] = 0;
            }
        }while (i != 0);
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
        System.out.println("Ghi file hoan tat");
    }
}