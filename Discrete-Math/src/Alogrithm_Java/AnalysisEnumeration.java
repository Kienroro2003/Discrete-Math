package Alogrithm_Java;

import java.util.Scanner;

public class AnalysisEnumeration {
    public static void display(int[] x, int length, int n){
        System.out.print(n + ": ");
        for (int i = 1; i < length; i++) {
            System.out.print(x[i]);
            if(i != length - 1){
                System.out.print(" + ");
            }
        }
        System.out.println();
    }
    public static void solve(int[] total, int[] x,int n,  int iCur){
        for(int i = x[iCur - 1]; i <= (n - total[iCur-1])/2; i++){
            x[iCur] = i;
            total[iCur] = total[iCur-1] + i;
            solve(total, x, n, iCur+1);
        }
        x[iCur] = n - total[iCur - 1];
        display(x, iCur + 1, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        int[] total = new int[n + 1];
        int[] x = new int[n + 1];
        x[0] = 1;
        solve(total, x, n,1);
    }
}
