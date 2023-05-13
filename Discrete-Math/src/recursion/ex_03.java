package recursion;

public class ex_03 {
    public static void solve(int num){
        if(num > 0){
            solve(num / 2);
            int temp = num % 2;
            System.out.print(temp);
        }
    }

    public static void main(String[] args) {
        solve(7);
    }
}
