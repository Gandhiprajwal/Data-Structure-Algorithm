package Patterns_Ques;

public class Butterfly_pattern {
    // BUTTERFLY PATTERN
    static void butterfly_patt(int num){
        // 1st half
        for(int i=1;i<=num;i++){
            // star 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            // spaces
            for(int j=1;j<=2*(num-i);j++){
                System.out.print(" ");
            }

            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for(int i=num;i>0;i--){
            // star 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            // spaces
            for(int j=1;j<=2*(num-i);j++){
                System.out.print(" ");
            }

            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        butterfly_patt(5);
    }
}

// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *