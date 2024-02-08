package Recursion;

public class FriendPairing {
    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        //choice
        int fnm1 = friendsPairing(n-1); //single
        int fnm2 = friendsPairing(n-2); // pair
        // pairWays
        int pairWays = (n-1) * fnm2;

        // totalWays
        int totalWays = fnm1 + pairWays;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(4));
    }
}
