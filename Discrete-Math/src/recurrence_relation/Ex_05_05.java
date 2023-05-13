package recurrence_relation;

public class Ex_05_05 {
    public static int solve(int n){
        if(n <= 2) return n;
        else return 4 * solve(n - 1) - 3 * solve(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Result: " + solve(3));
    }
}
