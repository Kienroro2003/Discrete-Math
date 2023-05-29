package Alogrithm_Java;

public class CombinationEnumerationTest {
    public static int total  = 0;
    public static void solve(int[] arr, int cur, int k, int n, int pre) {
        for (int i = 1; i <= n; i++) {
            if (pre == i) continue;
            arr[cur - 1] = i;
            if (cur == k) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j] + " ");
                }
                total++;
                System.out.println();
            } else solve(arr, cur + 1, k, n, arr[cur - 1]);
        }

    }

    public static void main(String[] args) {
        solve(new int[]{0, 0, 0}, 1, 3, 6, -1);
        System.out.println(total);
    }
}
