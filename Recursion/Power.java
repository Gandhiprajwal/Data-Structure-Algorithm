package Recursion;

public class Power {
    public static int powFunc(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * powFunc(x, n - 1);
    }

    public static int optimizePow(int x,int n){
        int halfPowerSq = optimizePow(x, n/2) * optimizePow(x, n/2);
        // n is odd
        if(n%2!=0){{
            
        }}
    }

    public static void main(String[] args) {
        System.out.println(powFunc(2, 10));
    } 
}
