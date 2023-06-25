package Patterns_Ques;

public class Half_pyramid_Rotated {
    // INVERTED & ROTATED HALF-PYRAMID
    static void inver_rota(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<num-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inver_rota(4);
    }
}

//     *
//    **
//   ***
//  ****