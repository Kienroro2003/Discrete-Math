package recursion;

public class ex_02 {
    public static int solve(int n, int k, int total){
        if(2 * k + 1 > n){
            return total;
        }else{
            total += 2 * k + 1;
            return solve(n, k + 1, total);
        }
    }

    public static void main(String[] args) {
        System.out.println(solve(6, 0, 0));
    }
}
