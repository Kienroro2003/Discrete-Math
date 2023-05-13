package recursion;

public class ex_01 {
    public static double solve(int num, double total){
        if(num == 1){
            return total + 1;
        }else{
            total += Math.pow(-1, num + 1) / num;
            return solve(num-1, total);
        }
    }

    public static void main(String[] args) {
        System.out.println("Result: " + solve(5, 0));
    }
}
