package recursion;

public class ex_04 {
    public static void solve(String num, int index){
        if(index > 0){
            System.out.print(num.charAt(index - 1));
            solve(num, index - 1);
        }
    }

    public static void main(String[] args) {
        String str = "123456789";
        solve(str, str.length());
    }
}
