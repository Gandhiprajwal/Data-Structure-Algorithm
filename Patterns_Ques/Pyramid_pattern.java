package Patterns_Ques;

public class Pyramid_pattern {
    static void pyramid_pattern(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= num-i; j++) {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num = 5;
        pyramid_pattern(num);
    }
}

//       * 
//      * *
//     * * *
//    * * * *
//   * * * * *