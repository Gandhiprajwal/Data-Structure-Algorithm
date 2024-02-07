package Recursion;

public class TilingProblem {
    static int tilingProblem(int n){ // 2 x n floor
        if(n==0 || n==1){
            return 1;
        }
        //vertical choice
        int verticalTiles = tilingProblem(n-1);
        //horizontal choice
        int horizontalTiles = tilingProblem(n-2);
        return verticalTiles + horizontalTiles;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(5));
    }
}
