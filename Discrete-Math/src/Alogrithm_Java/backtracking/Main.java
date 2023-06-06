package Alogrithm_Java.backtracking;

public class Main {
    /**
     * Sửa biến TOTAL_MONEY để theo dỏi kết quả
     */
    public static final int TOTAL_MONEY = 200000;
    public static final int[] denominations = {1000, 2000, 5000};
    public static int[] T = new int[1000];
    public static int[] A = new int[1000];
    public static void display(int n){
        for(int i = 0 ; i < n; i++){
            System.out.print(A[i]);
            if(i != n - 1){
                System.out.print(" + ");
            }
        }
        System.out.println();
    }

    public static void solve(int atTemp, int min){
        for (int i = 0; i < denominations.length; i++) {
            if(denominations[i] >= min){
                A[atTemp - 1] = denominations[i];
                T[atTemp] = T[atTemp - 1] + denominations[i];
//            System.out.println("Total money: " + T[atTemp]);
                if(T[atTemp] == TOTAL_MONEY){
                    display(atTemp);
                }else if(T[atTemp] > TOTAL_MONEY)break;
                else solve(atTemp + 1 , denominations[i]);
            }
        }
    }

    public static void main(String[] args) {
        solve(1, 0);
    }

}
