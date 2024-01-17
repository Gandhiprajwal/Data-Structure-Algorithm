package Recursion;

public class factorial {
    public static int factorialRecursion(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursion(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factorialRecursion(5));
    }
}
