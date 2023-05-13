package recursion;

import java.util.Scanner;

public class ex_05 {
    public static int solve(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return solve(b, a % b);
        }
    }

    public static void main(String[] args) {
        System.out.println(solve(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt()));
    }
}
