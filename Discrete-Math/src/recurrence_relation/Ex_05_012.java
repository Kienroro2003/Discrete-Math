package recurrence_relation;

public class Ex_05_012 {
    public static int solve(int month){
        if(month == 1) return 10;
        else return (int)Math.pow(5, month) * (int)Math.pow(2, month - 1) + solve(month - 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println("Result " + solve(3));
    }
}
