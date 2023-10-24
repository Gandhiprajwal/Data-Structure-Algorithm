public class fibonacci {
    static int nthfibonacci(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        int element=nthfibonacci(n-1)+nthfibonacci(n-2);
        return element;
    }
    public static void main(String args[]){
        System.out.println(nthfibonacci(26));
    }
}
