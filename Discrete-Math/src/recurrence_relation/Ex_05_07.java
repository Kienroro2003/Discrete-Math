package recurrence_relation;

public class Ex_05_07 {
    public final static int A0 = 1;
    public final static int A1 = 9;
    public static int solve(int n){
        if(n == 1)return A1;
        else if(n == 0)return A0;
        else return -7 * solve(n - 1) - 6 * solve(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Result: " + solve(2));
    }
}
