package recurrence_relation;

public class Ex_05_03 {
    public final static int A0 = 0;
    public final static int A1 = 1;

    public static int solve(int n){
        if(n <= 1)return n;
        return 5*solve(n - 1) - 6 * solve(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Result : " + solve(3));
    }
}
