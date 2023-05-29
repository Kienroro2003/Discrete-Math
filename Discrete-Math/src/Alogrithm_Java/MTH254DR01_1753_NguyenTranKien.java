package Alogrithm_Java;

public class MTH254DR01_1753_NguyenTranKien {
    /**
     * Liệt kê tập con của tập có 5 phần tử:
     * cam, xoai, quit, oi, chuoi
     */
    public static void display(String[] arrString, int[] arr, int k){
        for(int i = 0 ; i < k ; i++){
            System.out.print(arrString[arr[i] - 1] + " ");
        }
    }
    public static void solve2(int n, int k, int[] arr,String[] arrString) {
        int i;
        do {
            System.out.print("{");
            display(arrString, arr, k);
            System.out.println("}");
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

    public static void main(String[] args) {
        String[] arrString = {"cam", "xoai", "quit", "oi", "chuoi"};
        String[] arrString2 = {"5", "7", "6", "4", "3"};
        for(int i = 0; i <= arrString2.length; i++){
            int[] arr = new int[i];
            for(int j = 1; j <= i ; j++){
                arr[j - 1] = j;// i =2; arr[0] = 1, arr[1] = 2;
            }
            solve2(5,i, arr, arrString2);
        }
    }
}
