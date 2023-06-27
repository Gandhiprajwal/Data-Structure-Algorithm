package Patterns_Ques;

public class Diamond_Pattern {
    static void diamond_patt(int num){
        // 1-st Half
        for (int i=1;i<=num;i++){
            //spaces
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2-nd Half
        for(int i=num;i>=1;i--){
            //spaces
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamond_patt(4);
    }
}
 

//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *