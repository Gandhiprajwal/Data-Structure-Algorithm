package Recursion;

public class decreasingNUmber {
    public static void decreasingNUmber(int n){
        if(n==1){
           System.out.println(1);
           return;
        }
        System.out.println(n+" ");
        decreasingNUmber(n-1);
    }
    public static void main(String[] args) {
        decreasingNUmber(5);
    }
}
