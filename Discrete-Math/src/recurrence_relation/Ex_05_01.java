package recurrence_relation;

import java.util.Scanner;

public class Ex_05_01 {
    private final static double SALARY = 1000;
    private final static double RATE = 0.11;
    public static double P(int month){
        if(month == 0)return SALARY;
        else return (1 + RATE) * P(month - 1);
    }

    public static double p (int month){
        if(month == 0)return  SALARY;
        else return p(month - 1) + RATE * p(month - 1);
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println("So tien sau " + n +" thang: " + P(n));
        System.out.println("So tien sau " + n +" thang: " + p(n));
    }
}
