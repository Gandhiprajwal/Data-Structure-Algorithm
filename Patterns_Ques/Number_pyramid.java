package Patterns_Ques;

public class Number_pyramid {
    public static void main(String[] args) {
        int num = 5;
        number_pyra(num);
    }

    static void number_pyra(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

//     1 
//    2 2 
//   3 3 3 
//  4 4 4 4 
// 5 5 5 5 5 