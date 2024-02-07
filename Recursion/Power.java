package Recursion;

public class Power {
    public static int powFunc(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * powFunc(x, n - 1);
    }

    public static int optimizePow(int x,int n){
        if(n==0){
            return 1;
        }
        int halfPower = optimizePow(x, n/2);
        int halfPowerSq = halfPower*halfPower;
        // n is odd
        if(n%2!=0){
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {
        System.out.println(powFunc(2, 30));
    } 
}
