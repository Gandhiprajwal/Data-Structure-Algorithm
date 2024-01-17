package Recursion;

public class calcSum {
    public static int calcSum(int n){
        if(n==1){
            return 1;
        }
        int sumN1 = calcSum(n-1);
        int Sn = n + sumN1;
        return Sn;
    }
    public static void main(String[] args) {
        System.out.println(calcSum(5));
    }
}
