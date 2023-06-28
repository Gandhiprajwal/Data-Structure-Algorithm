package Patterns_Ques;

public class Palindrome_pattern {
    // PALINDROME PATTERN
    static void palindrome_patt(int num) {
        for (int i = 1; i <=num; i++) {
            
            // Spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            // Decrement in Number's
            for(int j=i;j>0;j--){
                System.out.print(j);
            }

            // Incremnet in Number's
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        palindrome_patt(5);
    }
}


//     1
//    212
//   32123
//  4321234
// 543212345