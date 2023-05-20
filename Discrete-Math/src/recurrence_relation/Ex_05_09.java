package recurrence_relation;

public class Ex_05_09 {
    public final static int A0 = 8;
    public final static int A1 = 5;
    public static int solve(int n){
        if(n == 0)return A0;
        else if(n == 1)return A1;
        else return solve(n - 1) + 6 * solve(n - 2) + 10 * n * (int)Math.pow(-2, n) - 3 * (int)Math.pow(-2, n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Result: " + solve(2));
    }
}
