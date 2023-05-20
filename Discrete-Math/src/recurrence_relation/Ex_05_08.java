package recurrence_relation;

public class Ex_05_08 {
    public final static int A0 = 1;
    public final static int A1 = 2;
    public static int solve(int n){
        if(n == 0) return A0;
        else if(n == 1) return A1;
        else return 2 * solve(n - 1) - 2 * solve(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Result: " + solve(4));
    }
}
